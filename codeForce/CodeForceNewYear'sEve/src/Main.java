import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        //long x = 1;


        //System.out.println(max);

        if (k == 1) {
            System.out.println(n);
            return;
        }

        long temp2 = 1;
        int max = (int) (Math.log(n)/Math.log(2));


        for(int i = max; max>0; max--){

           temp2 = temp2 *2 + 1;
            if(temp2 > n) {
                break;
            }
        }



        System.out.println(temp2);
    }
}






