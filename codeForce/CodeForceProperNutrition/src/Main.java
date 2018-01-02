import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int a = sc.nextInt();
        sc.nextLine();

        int b = sc.nextInt();
        sc.nextLine();
        sc.close();

        if(n % a == 0){
            System.out.println("YES");
            System.out.println(n/a +" " + "0");
            return;
        }

        if(n % b == 0) {
            System.out.println("YES");
            System.out.println(0 + " " + n/b);
            return;
        }
        int i = 0;
        int temp = 0;
        while(i * a <= n) {
            if((n - a * i) % b == 0) {
                temp = n - a * i;
                System.out.println("YES");
                System.out.print(i + " " + temp/b);
                return;
            }
            i++;
        }
        System.out.print("NO");

    }
}
