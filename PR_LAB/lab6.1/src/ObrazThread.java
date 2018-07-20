public class ObrazThread extends Thread {
    StringBuilder sb = new StringBuilder();
    private char mark;
    private  int counter = 0;
    private Obraz obraz;

    public ObrazThread(char mark, Obraz obraz) {
        this.mark = mark;
        this.obraz = obraz;
    }


    @Override
    public synchronized void start(){
        super.start();
        this.counter = 0;

        for(int i = 0; i<obraz.getTab().length; i++){
            for(int j = 0; j<obraz.getTab()[0].length; j++){
                if(mark == obraz.getTab()[i][j])
                    counter++;
            }
        }
        obraz.setHistogram(counter,(int)(mark)-33);

        String s = this.getName() + " - " + ((int)(mark)-33)+ " - " + mark + " - " + counter +"\n";

        for(int i = 0; i<counter; i++){
            sb.append(s);
            sb.append(" ");
        }

        System.out.print(sb.toString());

    }




}
