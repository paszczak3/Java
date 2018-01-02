import java.util.Scanner;

import static sun.jvm.hotspot.runtime.PerfMemory.initialized;
import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class Main {
    private  static final  int num_threads = 94;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = " ";

        System.out.println("Set image size: n (#rows), m(#kolumns)");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Obraz obraz_1 = new Obraz(n, m);

      //  obraz_1.calculate_histogram();
        //obraz_1.print_histogram();

        /*
        Thread watek1 = new Thread(new ObrazRunnable(obraz_1)," watek1");
        Thread watek2 = new Thread(new ObrazRunnable(obraz_1)," watek2");
        Thread watek3 = new Thread(new ObrazRunnable(obraz_1)," watek3");
        Thread watek4 = new Thread(new ObrazRunnable(obraz_1)," watek4");

        watek1.start();
        watek2.start();
        watek3.start();
        watek4.start();

        */



         System.out.println("Set number of threads");
         int num_threads = scanner.nextInt();

         //Watek[] NewThr = new Watek[num_threads];


        Thread[] watek = new Thread[num_threads];

         for (int i = 0; i < num_threads; i++) {
             watek[i] = new Thread(new ObrazRunnable((char) ((i*10)+33), obraz_1,10),"watek");
             watek[i].start();
         }


         for (int i = 0; i < num_threads; i++) {
             try {
         	watek[i].join();
             } catch (InterruptedException e) {}
         }
    }
}
