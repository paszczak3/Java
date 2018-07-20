import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt();
        int c = sc.nextInt(); int n = sc.nextInt();
        sc.nextLine();

        if (c > a || c > b || c > n) {
            System.out.println("-1");
            System.exit(0);
        }

        if (a > n || b > n){
            System.out.println("-1");
            System.exit(0);
        }

        int temp = n - (a + b - c);
        if (temp > 0)
            System.out.println(temp);
        else
            System.out.println("-1");
    }
}
