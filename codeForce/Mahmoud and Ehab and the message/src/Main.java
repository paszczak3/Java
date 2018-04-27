import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String , Integer> gr = new HashMap<>();
        int n,k,m;
        String tab[] = new String[100005];
        int cost[] = new int[100005];
        int gcost[] = new int[cost.length];

        n = sc.nextInt(); k =sc.nextInt(); m = sc.nextInt();
        sc.nextLine();

        for(int i = 0;  i<n ; i++) {
            tab[i] = sc.next();
        }
        sc.nextLine();
        for(int i = 0;  i<n ; i++) {
            cost[i] = sc.nextInt();
        }
        sc.nextLine();

        for(int i = 0; i<k; i++) {
            gcost[i] = Integer.MAX_VALUE;
            int x;
            x = sc.nextInt();
            while(x > 0) {
                x--;
                int z;
                z = sc.nextInt(); z--;
                gcost[i] = Math.min(gcost[i], cost[z]);
                gr.put(tab[z], i);

            }
            sc.nextLine();
        }
        long temp = 0;

        for(int i = 0; i<m;i++){
            String x;
            x = sc.next();
            temp += gcost[gr.get(x)];
        }

        System.out.println(temp);

    }
}


