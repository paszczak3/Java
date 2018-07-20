import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x;

        Set<Integer> set = new HashSet<>();
        List<Integer> list;
        Map<Integer, Tmp> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            x = sc.nextInt();
            list = new ArrayList<>();

            for (int j = 0; j < x; j ++) {
                list.add(sc.nextInt());
                sum += list.get(j);
            }

                for (int w = 0; w < list.size(); w++) {
                    if (set.contains(sum - list.get(w))) {
                        Tmp tmp = map.get(sum - list.get(w));
                        System.out.println("YES");
                        System.out.print(i + 1);
                        System.out.print(" ");
                        System.out.println(list.indexOf(list.get(w)) + 1);
                        System.out.println(tmp.getFirstIndex() + " " + tmp.getSecondIndex());
                        System.exit(0);
                    }
                }

            for (int w = 0; w < x; w++) {
                set.add(sum - list.get(w));
                map.put(sum - list.get(w), new Tmp(i + 1,w + 1));
            }
            sum = 0;
        }

        System.out.println("NO");
    }

}

class Tmp {
   private int firstIndex;
    private int secondIndex;

    public Tmp(int firstIndex, int secondIndex) {
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
    }


    public int getFirstIndex() {
        return firstIndex;
    }



    public int getSecondIndex() {
        return secondIndex;
    }

}
