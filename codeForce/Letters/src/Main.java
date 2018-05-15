import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Long> rooms = new ArrayList<>();
        List<Long> letterNumber = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            rooms.add(sc.nextLong());
        }
        sc.nextLine();

        for(int i = 0; i < m; i++) {
            letterNumber.add(sc.nextLong());
        }
        sc.nextLine();

        if(m == 1) {
            System.out.println("1 1");
            return;
        }

        long temp = 0;
        long secondTemp = 0;
        int k = 0;
        for(int j = 0; j < n; j++) {
            secondTemp += j != 0 ? rooms.get(j-1) : 0;
            temp += rooms.get(j);

            while(temp >= letterNumber.get(k)) {
                sb.append(j + 1);
                sb.append(" ");
                sb.append(Math.abs(secondTemp - letterNumber.get(k)));
                sb.append("\n");
                //letterNumber.remove(k);

                k++;
                if(k >= letterNumber.size()) {
                    break;
                }
            }
        }



        System.out.println(sb.toString());
        sc.close();

    }
}
