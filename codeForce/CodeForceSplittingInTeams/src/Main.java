import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tab = new int[n];
        int temp1 = 0;
        int temp2 = 0;

        for(int i = 0; i<n; i++){
            tab[i] = sc.nextInt();
            if(tab[i] == 1) {
                temp1++;
            } else {
                temp2++;
            }
        }

        int result = 0;

        if(temp2 == 0) {
            System.out.println(temp1/3);
            return;
        }

        if(temp1 == 0) {
            System.out.println(result);
            return;
        }

        if(temp1 == temp2) {
            System.out.println(temp2);
            return;
        }

        if(temp1 > temp2) {
            result = temp2 + (temp1 - temp2)/3;
            System.out.println(result);
        } else {
            System.out.println(temp1);
        }




    }
}

