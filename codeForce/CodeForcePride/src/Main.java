import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int tab[] = new int[n];
        int temp = 0;

        for(int i = 0;i<n; i++) {
            tab[i] = sc.nextInt();
            if(tab[i] == 1) {
                temp ++;
            }
        }

        if(temp != 0) {
            System.out.println(n - temp);
        } else {

            for(int i = 0; i<=n -1; i++){
                    temp=tab[i];
                for(int j = i+1; j<=n;j++){
                    temp=NWD(temp,j);
                }
            }
        }


        if(temp != 1) {
            System.out.println("-1");
        } else
            System.out.print(temp);

        sc.close();

    }

    public static int NWD(int x, int y) {
        int temp = 0;
        while(y!=0) {
            temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
}
