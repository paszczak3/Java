import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> set = new HashSet<>();
        set.add("ABC"); set.add("ACB"); set.add("BAC");
        set.add("BCA"); set.add("CAB"); set.add("CBA");
        String temp = "";

        for(int i = 0; i < s.length() - 2; i++) {
            temp += "" + s.charAt(i) + s.charAt(i+1) + s.charAt(i+2);
            if (set.contains(temp)) {
                System.out.println("YES");
                System.exit(0);
            } else
                temp = "";
        }
        System.out.println("NO");
    }
}

