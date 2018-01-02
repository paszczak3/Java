import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        long tab2[] = new long[n];
        long k = 0;
        for(int i = 0; i<n; i++){
            k += sc.nextInt();
        }

        for(int i = 0; i<n; i++) {
            tab2[i] = sc.nextInt();
        }

        Arrays.sort(tab2);
        long x = tab2[tab2.length - 1] + tab2[tab2.length - 2];

        if(x >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
