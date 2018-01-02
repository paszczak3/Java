import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int tab[] = new int[number];
        sc.nextLine();
        int temp = 0;
        int k = 1;

        for(int i = 0; i<number; i++){
            tab[i] = sc.nextInt();
            if(i==0){
                temp= tab[0];
                continue;
            }
            if(temp == tab[i]){
                k++;
            }
        }


        if(number == 1) {
            System.out.println(tab[0]);
            return;
        }

        if(number == 2) {
            System.out.print(Math.abs(tab[0] - tab[1]));
            return;
        }

        if(k == number && number%2 !=0){
            System.out.print(tab[0]);
            return;
        }

        if(k == number && number%2 == 0){
            System.out.print(0);
            return;
        }

        for(int i = 0; i<number; i++){

        }




    }
}
