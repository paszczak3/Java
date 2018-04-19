public class Main {
    public static void main(String[] args) {
        int tab[] = new int[6];
        tab[0] = 5; tab[1] = 2; tab[2] = 4; tab[3] = 6;
        tab[4] = 1; tab[5] = 3;



        int key = 0;
        int j = 0;

        for(int i = 1; i<tab.length; i ++) {
            key = tab[i];
            j = i - 1;

            while (j >= 0 && tab[j] > key) {
                tab[j+1] = tab[j];
                j = j -1;
            }
            tab[j+1] = key;
        }

        for(int i: tab) {
            System.out.println(i);
        }
    }
}
