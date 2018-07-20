import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int one = 1; int five = 5; int ten = 10;
        int twenty = 20; int oneHundred = 100;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int counter = 0;

        while (n != 0) {
            if (n >= oneHundred){
                n -= oneHundred;
                counter ++;
                continue;
            }

            if (n >= twenty){
                n -= twenty;
                counter ++;
                continue;
            }

            if (n >= ten){
                n -= ten;
                counter ++;
                continue;
            }

            if (n >= five){
                n -= five;
                counter ++;
                continue;
            }

            n -= one;
            counter ++;
        }

        System.out.println(counter);
    }
}




