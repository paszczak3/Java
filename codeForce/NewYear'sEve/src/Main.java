import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n,k;
        n = sc.nextLong();
        k = sc.nextLong();
        sc.nextLine();
        long temp = 1l;

        if(k == 1) {
            System.out.println(n);
            return;
        }

        while(temp <= n) {
            //temp <<= 1;
            temp = temp*2;

        }

        System.out.println(temp - 1);


        sc.close();
    }
}

