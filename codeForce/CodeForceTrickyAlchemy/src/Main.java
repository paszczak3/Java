import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;



// 1 yellow = 2 yellow crystal
// 1 green = 1 yellow, 1 blue crystal
// 1 blue = 3 blue crystal
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long yellowCrystals = sc.nextInt();
        long blueCtrystals = sc.nextInt();
        sc.nextLine();
        long yellowBalls = sc.nextInt();
        long greenBalls = sc.nextInt();
        long blueBalls = sc.nextInt();
        sc.nextLine();

      long requiredYellowCrystals = 0;
      long requiredBlueCrystals = 0;
      long temp = 0;
     // requiredYellowCrystals = yellowBalls * 2 + greenBalls;
      //requiredBlueCrystals = greenBalls + blueBalls * 3;


     // long temp = 0;
      BigInteger temp1 = BigInteger.valueOf(yellowBalls * 2 + greenBalls - yellowCrystals) ;
      BigInteger temp2 = BigInteger.valueOf(greenBalls + blueBalls*3 - blueCtrystals);
      BigInteger temp3 = BigInteger.valueOf(0);


     // System.out.println(temp1);
      //System.out.print(temp2);

      temp = temp1.compareTo(BigInteger.valueOf(0));
      if(temp == 1) {
          temp3 = temp3.add(temp1);
      }
      temp = temp2.compareTo(BigInteger.valueOf(0));

      if(temp == 1) {
          temp3 = temp3.add(temp2);
      }

      System.out.print(temp3);


      /*
      System.out.print(requiredYellowCrystals);
      System.out.print(requiredBlueCrystals);

      if(requiredYellowCrystals - yellowCrystals > 0) {
          temp += requiredYellowCrystals - yellowCrystals;
      }

      if(requiredBlueCrystals - blueCtrystals > 0) {
          temp += requiredBlueCrystals - blueCtrystals;
      }

      System.out.print(temp);

*/

    }
}


