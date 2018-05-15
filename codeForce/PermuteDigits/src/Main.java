import java.util.*;

public class Main{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = "";
        List<Integer> tab = new ArrayList();

        int k = 0;

        for(int i = 0; i<a.length(); i++) {
            tab.add(Integer.parseInt(String.valueOf(a.charAt(i))));
        }

        if(a.length() != b.length()) {
            Collections.sort(tab, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
            for(int i = 0; i < a.length(); i++) {
                result += tab.get(i);
            }
        } else {
            int temp;
            int w = 0;
            boolean m = true;

            while(m) {
                temp = -1;
                for (int i = 0; i < tab.size(); i++) {
                    if (tab.get(i) <= Integer.parseInt(String.valueOf(b.charAt(w))) && temp <= tab.get(i)) {
                        temp = tab.get(i);
                        k = i;
                    }
                }

                if(temp == -1) {
                    while (temp == -1) {
                        w--;
                        temp = Integer.parseInt(result.substring(result.length()-1));
                        result = result.substring(0,result.length()-1);
                        tab.add(temp);
                        temp = -1;

                        for(int i = 0; i<tab.size(); i++) {
                            if (tab.get(i) < Integer.parseInt(String.valueOf(b.charAt(w))) && temp <= tab.get(i)) {
                                temp = tab.get(i);
                                k = i;
                            }
                        }
                    }
                }
                    result += temp;
                    tab.remove(k);

                if (temp < Integer.parseInt(String.valueOf(b.charAt(result.length()-1)))) {
                    Collections.sort(tab, (o1, o2) -> o2.compareTo(o1));
                    for (int y : tab) {
                        result += y;
                    }
                    m = false;
                }

                w++;
                if(tab.size() == 0) {
                    break;
                }
            }
        }

        System.out.println(result);
        sc.close();

    }

}


