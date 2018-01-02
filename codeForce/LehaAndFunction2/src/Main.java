import java.awt.*;
import java.util.*;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Podaj rozmiar tablic");
        int size = sc.nextInt();

        Integer list[] = new Integer[size];
        int  list2[] = new int[size];

        //   System.out.println("Podaj elementy do tych tablic");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
        sc.nextLine();

        //  System.out.println("Tablica druga :");
        for (int i = 0; i < size; i++) {
            list2[i] = sc.nextInt();
        }

        long time1;

        long startTime = System.nanoTime();

        Arrays.sort(list, Collections.reverseOrder());


        sc.nextLine();
        sc.close();
        int k = 0;
        int x = 0;



        for(int i = 0; i<size; i++) {
            x = list[i];
            for(int j = 0; j<size; j++) {
                if(x >= list2[j]) {
                    x = list2[j];
                    k = j;
                }
            }
            list2[k] = list[i];
        }


        StringBuilder sb = new StringBuilder();
        for(int i: list2) {
            sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb.toString());

        time1 = System.nanoTime()-startTime;
        System.out.println("Time1: "+time1);

    }


}