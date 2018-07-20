public class Main {
    public static final int NUM_MAX_THREADS = 10;
    public static final long ITERATION = 50_000_000L;

    private static VolataileLongPadded[] paddedLongs;
    private static VolataileLongUnPadded[] unPaddedLongs;

    public static class VolataileLongPadded{
        public long q1,q2,q3,q4,q5,Q6;
        public volatile long value = 0L;
        public long q11,q12,a13,a14,q15,q16;
    }

    public static class VolataileLongUnPadded {
        public volatile long value = 0L;
    }

    static {
        paddedLongs = new VolataileLongPadded[NUM_MAX_THREADS];
        for (int i = 0; i < paddedLongs.length; i++){
            paddedLongs[i] = new VolataileLongPadded();
        }

        unPaddedLongs = new VolataileLongUnPadded[NUM_MAX_THREADS];
        for (int i = 0; i < unPaddedLongs.length; i++){
            unPaddedLongs[i] = new VolataileLongUnPadded();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        long being,end;

        for (int i = 1; i <= NUM_MAX_THREADS; i++){
            Thread[] threads = new Thread[i];

            for (int j = 0; j < threads.length; j++) {
                threads[j] = new Thread(createPaddedRunnable(j));
            }

            being = System.currentTimeMillis();
            for (Thread t : threads) {t.start(); }
            for (Thread t : threads) {t.join(); }
            end = System.currentTimeMillis();
            System.out.printf(" Padded # threads %d - T = %dms\n",i,end - being);

            for (int j = 0; j < threads.length; j++) {
                threads[j] = new Thread(createUnpaddedRunnable(j));
            }

            being = System.currentTimeMillis();
            for (Thread t : threads) {t.start(); }
            for (Thread t : threads) {t.join(); }
            end = System.currentTimeMillis();
            System.out.printf(" UnPadded # threads %d - T = %dms\n",i,end - being);

        }
    }

    private static Runnable createUnpaddedRunnable(final int k) {
        return () -> {
            long i = ITERATION + 1;
            while ( 0 != --i) {
                unPaddedLongs[k].value = i;
            }
        };
    }

    private static Runnable createPaddedRunnable(final int k ) {
        return () -> {
            long i = ITERATION + 1;
            while ( 0 != --i) {
                paddedLongs[k].value = i;
            }
        };
    }
}
