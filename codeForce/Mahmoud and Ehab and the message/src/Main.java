import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,m, temp;
        String words;
        int tabCost[] = new int[5];
        List<Integer> specialWords = new ArrayList<>();

        String wantsToSay;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k =sc.nextInt(); m = sc.nextInt();
        sc.nextLine();

        words = sc.nextLine();



        sc.nextLine();

        for(int i = 0; i < k; i++) {
            temp = sc.nextInt();
            if(temp > 1) {
                specialWords.add(temp);
                for(int j = 0; j<temp; j++) {
                    specialWords.add(sc.nextInt());
                }
            } else {
                sc.nextInt();
            }
            temp = 0;
        }

        sc.nextLine();
        wantsToSay = sc.nextLine();


        System.out.println(Arrays.toString(specialWords.toArray()));

        sc.close();
    }
}


class MyList{
    private int value;
    private String word;

    public MyList() {
    }

    public MyList(int value, String word) {
        this.value = value;
        this.word = word;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
