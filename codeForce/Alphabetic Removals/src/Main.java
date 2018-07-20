import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int tab[] = new int[26];
        int n = sc.nextInt(); int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char temp = 'a';
        if (k == n)
            System.out.println(" ");
        else {
            for (int i = 0; i < s.length(); i++) {
                tab[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < tab.length; i++) {
                if (k > tab[i]) {
                    k -= tab[i];
                } else {
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) >= temp) {
                            if (s.charAt(j) == temp && k > 0 ) {
                                k--;
                            } else
                                sb.append(s.charAt(j));
                        }
                    }
                    System.out.println(sb.toString());
                    System.exit(0);
                }
                temp++;
            }
        }
    }
}
