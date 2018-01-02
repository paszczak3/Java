import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,r,x,y,k;
        l = sc.nextInt();
        r = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        k = sc.nextInt();

        double temp = 0;
        for(int i = x; i <=y; ++i) {
            if (  (temp =  k  * i)  >= l && temp <= r ) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");


    }

}












