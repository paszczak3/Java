import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> tab = new ArrayList<>();
        int x = 0;

        for(int i = 0 ; i < n; i++){
            tab.add(sc.nextInt());

        }


        for(int i = 0; i < tab.size(); i++){
            int temp = tab.get(tab.size() - i - 1);

            for(int j = tab.size() - i - 2 ; j >= 0; j--) {

                if(temp == tab.get(j)){
                    tab.remove(j);
                }
            }
        }

        System.out.println(tab.size());
        for(int i: tab){
            System.out.print(i + " ");
        }



        sc.close();
    }
}
