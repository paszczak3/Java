import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = r - d;
        sc.nextLine();
        int numberOfSasuage = sc.nextInt();
        int sasugaesInside = 0;
        double nothing = 0;
        sc.nextLine();

        int tab[][] = new int[numberOfSasuage][3];

        for (int i = 0; i < numberOfSasuage; i++) {

            for (int j = 0; j < 3; j++) {
                tab[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }



        for (int i = 0; i < numberOfSasuage; i++) {
            // System.out.println("Odleglosc od punktu :" + sqrt(pow(0 + tab[i][0],2) + pow(0 + tab[i][1],2)));

            if( sqrt(pow(0 + tab[i][0],2) + pow(0 + tab[i][1],2)) >=  r -d + tab[i][2] &&  sqrt(pow(0 + tab[i][0],2) + pow(0 + tab[i][1],2)) +tab[i][2] <= r) {
                sasugaesInside++;
            }
        }


        System.out.println(sasugaesInside);

    }

}