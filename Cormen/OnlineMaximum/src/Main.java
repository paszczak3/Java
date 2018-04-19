import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tab[] = new int[10];

        for(int i = 0; i<tab.length; i++){
            tab[i] = new Random().nextInt(Byte.MAX_VALUE);
            System.out.println(tab[i]);
        }

        int k = new Random().nextInt(tab.length);
        System.out.println("k = " + k);

        int best = onLineMaximum(k,tab.length,tab);
        System.out.println("best = " + best);
    }

    public static int onLineMaximum(int k, int n, int tab[]){
        int bestScore = -1;

        for(int i = 0; i<k; i++) {
            if(tab[i] > bestScore) {
                bestScore = tab[i];
            }
        }

        for(int i = k; k<tab.length; k++) {
            if(tab[i] > bestScore){
                return i;
            }
        }

        return tab.length;
    }

}
