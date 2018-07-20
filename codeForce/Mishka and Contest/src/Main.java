import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        int temp = 0;
        sc.nextLine();

        int tab[] = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }
        sc.nextLine();

        int i = 0;
        while (i < tab.length && k >= tab[i] ) {
            temp++;
            i++;
        }

        if (temp != tab.length) {
            i = tab.length -1;
            while(k >= tab[i]) {
                temp++;
                i--;
            }
        }

        System.out.println(temp);
    }
}
