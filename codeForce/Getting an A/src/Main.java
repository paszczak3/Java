import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Comparator<Integer> BYINT = Comparator.comparing(Integer::intValue);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int counter = 0;
        double temp = 0.0d;
        double sum = 0.0d;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            temp += list.get(i);
        }

        sum = temp;
        temp /= n;
        if (temp >= 4.5d){
            System.out.println(0);
            System.exit(0);
        }
        list.sort(BYINT);

        /*
        while (sum/n < 4.5d){
            sum += 5 - list.get(counter);
            counter++;
        }
        */

        //System.out.println(counter);

    }
}

class SumAndChanges{
    int sum;
    int changes;

    public SumAndChanges() {
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getChanges() {
        return changes;
    }

    public void setChanges(int changes) {
        this.changes = changes;
    }

    public SumAndChanges(int sum, int changes) {
        this.sum = sum;
        this.changes = changes;
    }
}
