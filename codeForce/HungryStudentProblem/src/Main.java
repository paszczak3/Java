import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int x = 0;
        StringBuilder sb = new StringBuilder();
        String s = "";
        sc.nextLine();

        for(int i = 0; i < n; i ++) {
            x = sc.nextInt();
            sc.nextLine();
            if( x %3 == 0 || x % 7 == 0 || x % 10 == 0) {
                sb.append("YES" + '\n');


            } else {
                sb.append("NO" + '\n');
            }
        }

        System.out.println(sb.toString());






        sc.close();
    }
}
