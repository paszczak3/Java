import java.util.Scanner;

import static java.lang.Double.min;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        int n;
        int x = 0;
        n = sc.nextInt();
        k = sc.nextInt();

        if(k == 0) {
            System.out.println(0 + " " + 0);
            return;
        }

        if(k == n) {
            System.out.println(0 + " " + 0);
            return;
        }

        /*
        if(n%2 == 0 && k >= n/2 -1) {
           x = n - k;
           System.out.println(1 + " " + x);
           return;
        }

        if(k >= n/2 && n%2 != 0) {
            x = n - k;
            System.out.println(1 + " " + x);
            return;
        }

*/
        System.out.println(1 + " " + (int)min(n-k,2*k));


    }
}

