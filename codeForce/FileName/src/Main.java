import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();


        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int temp = 0;
        char c;
        int x = 0;
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'x') {
                temp++;
            } else {
                temp = 0;
            }

            if(temp == 3){
                x++;
                temp = 0;
                s = s.substring(0, i) + s.substring(i+1);
                i = 0;
            }
        }

        temp = 0;
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'x') {
                temp++;
            } else {
                temp = 0;
            }

            if(temp == 3){
                x++;
                temp = 0;
            }
        }


        System.out.println(x);
        sc.close();
    }
}
