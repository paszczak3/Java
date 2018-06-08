import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        if (n == 1) {
            System.out.println("YES");
            System.out.println(list.get(0));
        }


        if (list.size() >= 2) {
            Collections.sort(list,new SizeSort());
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).contains(list.get(i+1))){
                    n--;
                }

            }
            if (n == 1) {
                System.out.println("YES");
                for (int i = list.size() -1; i >= 0; i--) {
                    System.out.println(list.get(i));
                }
            } else {
                System.out.println("NO");
            }
        }


    }
}

class SizeSort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -1 * (o1.length() - o2.length());
    }
}