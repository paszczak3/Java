import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < k; i++){
            if(lastNumber(n) == 0) {
                n = n/10;
                continue;
            }
            n--;
        }

        System.out.println(n);

        sc.close();

    }

    public static int lastNumber(int x){
        return x%10;
    }
}
