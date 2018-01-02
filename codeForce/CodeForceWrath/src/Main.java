import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tab[] = new int[n];
        int x = 0;
        int temp = 0;

        for(int i = 0;i<n;i++){
            tab[i] = sc.nextInt();
        }

        for(int i = tab.length - 1; i>0; i --) {
            if(tab[i] >= x) {
                x = tab[i];
            }

            if(x == 0 ) {
                temp++;
            }

            x --;
        }

       temp++;
       System.out.println(temp);

    }
}




