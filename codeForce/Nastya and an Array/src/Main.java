import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }

        if (set.contains(0))
            System.out.println(set.size() - 1);
        else
            System.out.println(set.size());
    }
}
