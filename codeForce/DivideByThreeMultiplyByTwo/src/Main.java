import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        long temp;

        List<Long> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        sc.nextLine();
        Collections.sort(list);

        if(n == 2) {
            System.out.println(list.get(1) + " "+ list.get(0));
            System.exit(0);
        }
        List<Long>list2 = new ArrayList<>();
        Collections.sort(list);

        for(int i = 0; i < n; i++) {
            temp = list.get(i);
            list2.add(temp);

            for(int j = 0; j < n; j++) {

                if(temp/3 == list.get(j) || temp * 2 == list.get(j) ) {
                    temp = list.get(j);
                    list2.add(temp);
                    j = -1;
                }
            }
            if(list2.size() == list.size()) {
                break;
            } else {
                list2.clear();
            }
        }

        for(long l : list2) {
            sb.append(l);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
