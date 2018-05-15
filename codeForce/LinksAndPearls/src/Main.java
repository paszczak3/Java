import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int x = 0;
        int y = 0;
        char c;

        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if( c == 'o') {
                x++;
            } else {
                y++;
            }
        }

        if( (y == 0 && x != 0 ) || (x == 0 && y != 0) || y % x == 0 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


