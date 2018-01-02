import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int tab[] = new int[2];
        int i = 0;
        double k = 0;

        if(n %2 == 0) {
            n = n/2;
            k = n ;
            if(n %2 == 0) {
                tab[0] = (int) n - 1;
                tab[1] = (int) n + 1;
                System.out.print(tab[0] + " ");
                System.out.print(tab[1]);
            } else {
                do {
                   n = n - 1;
                   i++;
                } while (n %2 == 0);
                tab[0] = (int) n;
                tab[1] = (int) (k + i);
                System.out.print(tab[0] + " ");
                System.out.print(tab[1]);
            }
        } else {
            n = n/2;
            tab[0] = (int) (n - 0.5);
            tab[1] = (int) (n + 0.5);
            System.out.print(tab[0] + " ");
            System.out.print(tab[1]);

        }


    }
}

