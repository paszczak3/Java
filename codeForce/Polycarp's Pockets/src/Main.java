import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int tab[] = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }
        sc.nextLine();
        Arrays.sort(tab);

        int counter = 1; int max_counter = 1;

        for (int i = 0; i < n - 1; i++) {
            if (tab[i] == tab[i +1])
                counter++;
            else {
                if (counter > max_counter){
                    max_counter = counter;
                }
                counter = 1;
            }
        }


        if (counter > max_counter)
            max_counter = counter;


        System.out.println(max_counter);

    }
}



