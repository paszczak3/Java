
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        int tab[] = new int[26];
        String s = sc.nextLine();
        String ballons[] = s.split("");

        trueOrNo(tab,ballons,y);

    }

    public static void trueOrNo(int tab[], String ballons[],int y) {
        for (int i = 0; i < ballons.length; i++) {
            if (ballons[i].equals("a")) {
                tab[0]++;
            }
            if (ballons[i].equals("b")) {
                tab[1]++;
            }
            if (ballons[i].equals("c")) {
                tab[2] ++;
            }
            if (ballons[i].equals("d")) {
                tab[3]++;
            }
            if (ballons[i].equals("e")) {
                tab[4]++;
            }
            if (ballons[i].equals("f")) {
                tab[5]++;
            }
            if (ballons[i].equals("g")) {
                tab[6]++;
            }
            if (ballons[i].equals("h")) {
                tab[7]++;
            }
            if (ballons[i].equals("i")) {
                tab[8]++;
            }
            if (ballons[i].equals("j")){
                tab[9]++;
            }
            if (ballons[i].equals("k")) {
                tab[10]++;
            }
            if (ballons[i].equals("l")) {
                tab[11]++;
            }
            if (ballons[i].equals("m")) {
                tab[12]++;
            }
            if (ballons[i].equals("n")) {
                tab[13]++;
            }
            if (ballons[i].equals("o")) {
                tab[14]++;
            }
            if (ballons[i].equals("p")) {
                tab[15]++;
            }
            if (ballons[i].equals("q")) {
                tab[16]++;
            }
            if (ballons[i].equals("r")) {
                tab[17]++;
            }
            if (ballons[i].equals("s")) {
                tab[18]++;
            }
            if (ballons[i].equals("t")) {
                tab[19]++;
            }
            if (ballons[i].equals("u")) {
                tab[20]++;
            }
            if (ballons[i].equals("v")) {
                tab[21]++;
            }
            if (ballons[i].equals("w")) {
                tab[22]++;
            }
            if (ballons[i].equals("x")) {
                tab[23]++;
            }
            if (ballons[i].equals("y")) {
                tab[24]++;
            }
            if (ballons[i].equals("z")) {
                tab[25]++;
            }
        }
        int k = 0;
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] > y) {
                    k++;
                }
            }
        if(k > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
