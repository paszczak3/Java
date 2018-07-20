import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int min = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt() -  i);
            if (list.get(i) <= 0) {
                temp = i + 1;
                break;
            }
        }
        sc.nextLine();
        if (temp == -1) {
            for (int i = 0; i < n; i++){
                list.set(i,list.get(i)/ n + (list.get(i) % n == 0 ? 0 : 1));
            }

            for (int i = 0; i < n; i++) {
                if (list.get(i) < min){
                    min = list.get(i);
                    temp = 1 + i;
                }
            }
        }
        System.out.println(temp);
    }
}



