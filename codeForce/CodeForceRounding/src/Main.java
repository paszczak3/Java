import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n%10 >= 5) {
            n += 10 - (n%10);
        } else {
            n -= n%10;
        }

        System.out.println(n);
        //System.out.println(Math.floor(n));

    }
}
