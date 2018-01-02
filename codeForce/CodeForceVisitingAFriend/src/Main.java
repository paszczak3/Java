import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int tab[] = new int[n*2];
        for(int i = 0; i< n*2; i++){
            tab[i] = sc.nextInt();
        }

        if(n == 0) {
            System.out.print("no");
            return;
        }
        if(tab[0] > 0) {
            System.out.print("no");
            return;
        }

        if(tab[1] >= m) {
            System.out.print("yes");
            return;
        }

        int temp = tab[1];


        int i = 2;
        while(i < tab.length) {
            if(temp >= tab[i]) {
                if(tab[i + 1] > temp) {
                    temp = tab[i + 1];
                }
                if(temp >= m) {
                    System.out.print("yes");
                    return;
                }
                if(i + 2 > tab.length) {
                    System.out.print("no");
                    return;
                }
                i = i +2;
            } else {
                i++;
            }
        }

        System.out.print("no");






    }
}
