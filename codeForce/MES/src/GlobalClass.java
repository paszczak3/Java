import java.util.InputMismatchException;
import java.util.Scanner;

public class GlobalClass {
    private Scanner sc = new Scanner(System.in);
    public static double L;
    public static int nh;
    public static double K;
    public static double S;
    public static double alfa;
    public static double  q;
    public static double tAlfa;

    public GlobalClass() {
       typeValues();
    }

    public void typeValues() throws InputMismatchException{
        try {
            System.out.println("Podaj L");
            L = sc.nextDouble();
            sc.nextLine();
            System.out.println("nh, Podaj liczbe wezlow");
            this.nh = sc.nextInt();
            sc.nextLine();
            System.out.println("Podaj K, wspolczynnik przeowdzenia ciepla");
            K = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podaj S, powierzchnia");
            S = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podaj alfa");
            this.alfa = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podaj q");
            this.q = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podaj tAlfa");
            this.tAlfa = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw new NumberFormatException("liczba wprowadzona w niepoprawnym formacie");
        }
    }

}
