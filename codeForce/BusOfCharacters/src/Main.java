import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        Element tab[] = new Element[n];

        for(int i = 0; i < n; i++){
            tab[i] = new Element(sc.nextInt(),i+1);
        }

        List<Integer> list = new ArrayList<>();
        String s = sc.next();
        Arrays.sort(tab);

        int j = 0;
        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '0'){
                sb.append(tab[j].row + " ");
                list.add(i,tab[j].row);
                j++;
            } else {
                list.add(i,tab[j-1].row);
            }
        }


        int tmp = 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(list.get(i) == list.get(i+1)) {
                tmp ++;
            } else {
                tmp = 0;
            }

            if(tmp >= 2) {
                int k = i+1;
                for(int w = k; w > 0; w--) {

                    if((list.get(w) != list.get(w-1) && w == 1 ) || list.get(w) != list.get(w-1) && list.get(w) != list.get(w-2)) {
                        list.set(i+1,list.get(w-1));
                        break;
                    }
                }
            }
        }

        for(int i: list){
            System.out.print(i + " ");
        }

    }
}

class Element implements Comparable<Element>{
     int width;
     int row;

    public Element(int width, int row) {
        this.width = width;
        this.row = row;
    }

    @Override
    public int compareTo(Element o) {
        return width - o.width;
    }
}

