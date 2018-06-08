import java.util.ArrayList;g
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); sc.nextLine();
        int tab[] = new int[k];
        List<Integer> lists = null;

        for (int i = 0; i < k; i++) {
            tab[i] = sc.nextInt();
            sc.nextLine();
            lists = new ArrayList<>();
            for (int j = 0; j < tab[i]; j++){
                lists.add(new Integer(sc.nextInt()));
            }
            sc.nextLine();
        }

    }
}
