import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        if(n == 1) {
            if (s.equals("0")) {
                System.out.println("No");
            } else {
                System.out.println("YES");
            }
            System.exit(0);
        }

        if(s.charAt(0) == '0' && s.charAt(1) == '0'){
            System.out.println("NO");
            System.exit(0);
        }

        if(s.charAt(s.length()-1) == '0' && s.charAt(s.length()-2) == '0'){
            System.out.println("NO");
            System.exit(0);
        }

        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) == '1' && s.charAt(i+1) == '1') {
                System.out.println("NO");
                System.exit(0);
            }

            if(s.charAt(i) == '0' && s.charAt(i+1) == '0' && s.charAt(i+2) == '0'){
                System.out.println("NO");
                System.exit(0);
            }
        }


        System.out.println("YES");


    }
}
