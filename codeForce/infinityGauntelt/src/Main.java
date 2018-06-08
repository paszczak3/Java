import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("purple","Power");
        map.put("green","Time");
        map.put("blue","Space");
        map.put("orange","Soul");
        map.put("red","Reality");
        map.put("yellow","Mind");
        int n = sc.nextInt();

        String s;
        for (int i = 0; i < n; i++) {
            s = sc.next();
            if (map.containsKey(s)) {
                map.remove(s);
            }
        }
        sc.nextLine();
        sc.close();

        System.out.println(6 - n);
        map.forEach((K,V) -> System.out.println(map.get(K)));



    }
}
