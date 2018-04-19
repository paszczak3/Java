import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();


        if(x > 26) {
            System.out.println(y);
        } else {
            int result = (int) (y % Math.pow(2,x));
            System.out.println(result);
        }

    }
}
