import java.util.*;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>(size);
        int list2[] = new int[size];

        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            list2[i] = sc.nextInt();
        }
        sc.nextLine();
        sc.close();
        // int k = 0;
        // int x = 0;

        Collections.sort(list, Collections.reverseOrder());

        /*
        for(int i = 0; i<size; i++) {
            x = list.get(i);
            for(int j = 0; j<size; j++) {
                if(x >= list2[j]) {
                    x = list2[j];
                    k = j;
                }
            }
            list2[k] = list.get(i);
        }
        */

        /*
        StringBuilder sb = new StringBuilder();
        for(int i: list2) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString());
        */
    }
}