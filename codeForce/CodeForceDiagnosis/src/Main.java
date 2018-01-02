import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        scanner.nextLine();
        int temp = 0;
        int x = 0;
        int tabS[] = new int[n];
        int tabD[] = new int[n];

        for(int i = 0; i<n ; i++){
            tabS[i] = scanner.nextInt();
            tabD[i] = scanner.nextInt();
            scanner.nextLine();
        }
        x = tabS[0];

        int k = 1;

        for(int i = 1;i<n; i++) {
                while(x >= temp) {
                    temp = tabS[i];
                    if(temp <= x ){
                        temp = tabS[i] + k++ *tabD[i];
                    }
                }
            x = temp;
            k = 0;
        }

        System.out.println(x);
    }
}
