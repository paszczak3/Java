import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        List<Integer> list = new ArrayList<>();
        int counter = 0; String s = "";

        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
            if (list.get(i) == 1)
                counter++;
        }
        sc.nextLine();

        System.out.println(counter);
        int tab[] = new int[counter];
        int temp = 0;

        if (list.size() > 1) {
            if (list.get(0) == list.get(1)){
                tab[temp] = 1;
                s += tab[temp] + " ";
                temp++;
            }

            for (int i = 1; i < n; i++) {
                if (list.get(i) == 1) {
                    tab[temp] = list.get(i - 1);
                    s += tab[temp] + " ";
                    temp++;
                }

                if (i == n - 1 && temp != counter) {
                    tab[temp] = list.get(i);
                    s += tab[temp] + " ";
                }

            }
        } else {
            System.out.println(list.get(0));
        }


        System.out.println(s);

    }
}
