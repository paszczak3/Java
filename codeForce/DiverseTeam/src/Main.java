import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        sc.nextLine();

        int temp = k;
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (!list.contains(x)) {
                list.add(x);
                index.add(i+1);
                temp--;
                if (index.size() == k)
                    break;
            }
        }

        if (temp != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            index.forEach(m -> System.out.print(m + " "));
        }

    }
}

