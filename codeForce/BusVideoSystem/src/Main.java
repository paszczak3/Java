import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //liczba przystankow
        int w = sc.nextInt();  //pojemnosc busa
        sc.nextLine();

        long r = 0;
        long l = 0;
        long amount = 0;
        long temp = 0;

        for(int i = 0; i < n; i++){
            amount += sc.nextInt();
            l = Math.max(l,amount);
            r = Math.min(r, amount);
        }

        temp = r + (w - l) + 1;
        System.out.println(temp > 0 ? temp : 0);
        sc.close();
    }
}
