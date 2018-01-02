import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a;
        long b;
        a = sc.nextLong();
        b = sc.nextLong();
        long number = b - a;
        if(a == 0 || b == 0) {
            System.out.println(0);
            return;
        }

        long amount = 1;
        long z = b%10;
        for(int i = 0; i<number; i++) {
            amount *= z;
            z--;
        }
        System.out.println(amount%10);
        sc.close();
    }

}




