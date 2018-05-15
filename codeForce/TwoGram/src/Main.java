import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char tab[] = new char[2];
        String printer = "";
        int temp = 0;
        int secondTemp = -1;

        if(n <= 3) {
            System.out.println("" + s.charAt(0) + s.charAt(1));
        } else {

            for(int i = 0; i < s.length() - 1; i++) {
                tab[0] = s.charAt(i); tab[1] = s.charAt(i + 1);
                for(int j = 0; j < s.length()-1; j++) {

                    if(tab[0] == s.charAt(j) && tab[1] == s.charAt(j+1)){
                        temp++;
                    }
                }
                if(temp > secondTemp) {
                    secondTemp = temp;
                    printer = "" +tab[0] + tab[1];
                }
                temp = 0;
            }
        }
        System.out.println(printer);

        //System.out.println(Arrays.toString(tab));

    }
}
