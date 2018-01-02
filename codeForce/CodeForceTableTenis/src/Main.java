import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double k;
        n = sc.nextInt();
        k = sc.nextDouble();
        sc.nextLine();
        int tab[] = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }
        sc.nextLine();
        int x = 0;

        // row wiekszy niz liczba graczy
        if (k >= n) {
            for (int i = 0; i < n; i++) {
                if (x < tab[i]) {
                    x = tab[i];
                }
            }
            System.out.println(x);
            return;
        }
        int j = 0;
        int w = 0;

        for(int i = 0; i<n-1; i++){
            if(tab[j] > tab[i+1] ) {
                w++;
                if(w == k) {
                    x = tab[j];
                    break;
                }
            } else {
                w = 1;
                x = tab[i+1];
                j = i + 1;
            }
        }

            if (x != 0) {
                System.out.println(x);
            }

            //Jesli nic nie znajdzie

            if (x == 0) {
                for (int i = 0; i < n; i++) {
                    if (x < tab[i]) {
                        x = tab[i];
                    }
                }
                System.out.println(x);
            }
        }
    }


