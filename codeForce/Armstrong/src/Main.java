import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tab[] = new int[10];
        int tab2[] = new int[10];
        int dest = 0;
        for(int i = 0; i<tab.length; i++) {
            tab[i] = i;
            tab2[i] = i;
        }


        int offset = new Random().nextInt(tab.length);
        System.out.println(offset);

        for (int i = 0; i < tab.length ; i++) {
            dest = i + offset;
            if (dest >= tab.length) {
                dest = dest - tab.length;
            }
            tab2[dest] = tab[i];
        }

        System.out.println(Arrays.toString(tab2));







    }
}
