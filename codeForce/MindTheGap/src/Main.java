import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        sc.nextLine();
        int tab[] = new int[n * 2];
        long minutes = 0;
        long minutes2 = 0;
        int h = 0, m = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = sc.nextInt();
        }


        int i = 0;
        while (i < tab.length - 3) {
            if(tab[0] > 0 || tab[1] > 0) {
                if(s+1 < tab[0] * 60 + tab[1]) {
                    System.out.println(h + " " + m);
                    return;
                }
            }
            minutes = tab[i] * 60 + tab[i + 1];
            minutes2 = tab[i+2] * 60 + tab[i + 3];

            if (minutes + s + 1 < minutes2 - s) {
                h = (int) (minutes + s + 1) / 60;
                m = (int) (minutes + s + 1) % 60;
                break;
            }

            i = i + 2;

        }

        if(i > 0 && h == 0 && m == 0) {
            minutes = tab[n*2 - 2] * 60 + tab[n*2 - 1];
            h = (int) (minutes + s + 1) / 60;
            m = (int) (minutes + s + 1) % 60;
         }

        System.out.println(h + " " + m);
    }
}
