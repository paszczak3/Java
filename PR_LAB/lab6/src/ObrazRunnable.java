public class ObrazRunnable implements Runnable {
    StringBuilder sb = new StringBuilder();
    private Obraz obraz;
    private int counter;
    private char mark;

    public ObrazRunnable(char mark, Obraz obraz, int counter) {
        this.mark = mark;
        this.obraz = obraz;
        this.counter = counter;

    }

    @Override
    public void run() {
       display();
    }


    public void display() {
        synchronized (obraz) {
            for(int i = 0; i< counter; i++) {
                for(int j = 0; j<obraz.getTab().length; j++) {
                    for(int k = 0; k<obraz.getTab()[0].length; k++){
                        if((char) (((int) mark) + i) == obraz.getTab()[j][k]) {
                            obraz.setHistogram(obraz.getHistogram()[(int) (mark+i) -33] +1,(int) (mark+i) - 33);
                        }
                    }
                }
            }

            for(int i = 0; i<counter; i++) {
                 sb.append(Thread.currentThread().getName());
                 sb.append(((int) (mark) -33) + " " + (char)(int)(mark)+i + " ");
                 for(int k = 0; k< obraz.getHistogram()[(int) (mark+i) -33]; k++) {
                     sb.append("=");
                }
            }



            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.print(sb.toString());
            }
        }
    }

/*

    public void createHistogram() {
        synchronized (obraz) {
            obraz.calculate_histogram();
            System.out.println(" ");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
               // display(Thread.currentThread().getName());
                obraz.print_histogram();
            }
        }
    }

    */


}







