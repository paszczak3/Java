import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,n,s,p;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt(); n = sc.nextInt(); s = sc.nextInt();
        p = sc.nextInt(); sc.nextLine();
        double sheets = 0;
        double x = 0;

        if( s >= n) {
            x = k;
        } else {
            sheets = (double) n / s;

            if(sheets > (int) sheets) {
                sheets = (int) sheets;
                sheets++;
            }
            x = (k * n * sheets)/ n;
        }

        double temp = x / p;

        if(temp > (int) temp) {
            temp = (int) temp;
            temp++;
        }

        System.out.println((int)temp);

    }
}
