import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tab[] = {4,1,3,2,16,9,10,14,8,7};
        heapSort(tab);
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
        System.out.println(Arrays.toString(tab));

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
