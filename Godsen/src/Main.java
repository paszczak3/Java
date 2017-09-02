import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int x = 0;
        List<Integer> list = new ArrayList<>(size);
        for(int i = 0; i<size ;i++) {
            list.add(sc.nextInt());
        }
        sc.nextLine();
        sc.close();

        if(amount(list,0) %2 != 0) {
            System.out.println("First");
            return;
        } else {
            for(int i = 0; i<list.size() ;i++) {
                x += list.get(i);
                if(x %2 != 0 && amount(list,i+1) %2 !=0) {
                    System.out.println("First");
                    return;
                }
            }
        }

        System.out.println("Second");

    }

    public static int amount(List<Integer> list,int k) {
        int suma = 0;
        for(int i = k; i <list.size(); i ++) {
            suma += list.get(i);
        }
        return suma;
    }
}