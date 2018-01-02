import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,r,amount;
        a = sc.nextInt();
        sc.nextLine();
        r = sc.nextInt();
        sc.nextLine();
        amount = sc.nextInt();

        int wynik = 0;
        if( a <= 0 ) {
            wynik = r * (amount - 1) + a;
        } else
        {
            wynik = r * (amount - 1);
            if(wynik < 0) {
                wynik = wynik + a;
            } else
            {
                wynik = wynik - a;
            }
        }
        System.out.println(wynik);
    }
}
