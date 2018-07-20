import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =  sc.nextLong();

        if (n == 0) {
            System.out.println("0");
            System.exit(0);
        }
        n += 1;
        if (n % 2 == 0) {
            System.out.println(n/2);
        } else {
            System.out.println(n);
        }

    }
}
