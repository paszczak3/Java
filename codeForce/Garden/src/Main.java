import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int w;
        int temp = 0;
        int time = Integer.MAX_VALUE;

        sc.nextLine();
        for(int i = 0; i < n; i++) {
            w = sc.nextInt();
            if( k % w == 0) {
                temp = k/w;
                if(temp < time) {
                    time = temp;
                }
            }
        }

        sc.nextLine();
        System.out.println(time);
        sc.close();
    }
}
