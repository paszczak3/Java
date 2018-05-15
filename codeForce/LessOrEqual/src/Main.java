import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        sc.nextLine();
        int x = -1;

        //List<Integer> list = new ArrayList<>();
        int list[] = new int[n + 2];
        list[0] = 1;
        for(int i = 1; i <=n; i++){
            //list.add(sc.nextInt());
            list[i] = sc.nextInt();
        }
        //list.add(Integer.MAX_VALUE);
        list[n+1] = Integer.MAX_VALUE;

        sc.nextLine();
        //Collections.sort(list);
        //quickSort(list,0,list.length-1);
        heapSort(list);

        if(list[k] < list[k+1]) {
            System.out.println(list[k]);
        } else
            System.out.println(x);

        sc.close();
    }

    public static void maxHeapify(int tab[], int index) {
        int l = 0;
        int r = 0;

        if(index < 1) {
            l = 1;
            r = 2;
        } else {
            l = index * 2 + 1;
            r = index * 2 + 2;
        }

        int largest = 0;

        if(l <= tab.length-1 && tab[l] > tab[index]) {
            largest = l;
        } else {
            largest = index;
        }

        if(r <= tab.length-1 && tab[r] > tab[largest]) {
            largest = r;
        }

        if(largest != index) {
            int x = tab[index];
            tab[index] = tab[largest];
            tab[largest] = x;
            maxHeapify(tab,largest);
        }
    }

    public static void BuildMaxHeap(int tab[]) {
        for(int i = tab.length/2; i>-1; i--) {
            maxHeapify(tab,i);
        }
    }

    public static void heapSort(int tab[]) {
        BuildMaxHeap(tab);
        //System.out.println(Arrays.toString(tab));
        int y = tab.length - 1;
        int x = 0;
        for(int i = y; i>-1; i--){
            x = tab[i];
            tab[i] = tab[0];
            tab[0] = x;
            // tab = Arrays.copyOf(tab,tab.length-1);
            y--;
            maxHeapify(tab,0,y);
        }
        //System.out.println(Arrays.toString(tab));

    }

    public static void maxHeapify(int tab[], int index, int size) {
        int l = 0;
        int r = 0;

        if(index == 0) {
            l = 1;
            r = 2;
        } else {
            l = index * 2 + 1;
            r = index * 2 + 2;
        }

        int largest = 0;

        if(l <= size && tab[l] > tab[index]) {
            largest = l;
        } else {
            largest = index;
        }

        if(r <= size && tab[r] > tab[largest]) {
            largest = r;
        }

        if(largest != index) {
            int x = tab[index];
            tab[index] = tab[largest];
            tab[largest] = x;
            maxHeapify(tab,largest,size);
        }
    }


}