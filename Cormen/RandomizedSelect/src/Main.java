import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tab[] = {2,8,7,1,3,5,6,4};
        int wynik =  randomizedSelected(tab,0,tab.length-1, tab[1]);
        System.out.println(wynik);
    }

    public static int partition(int A[], int p, int r) {
        int temp = A[r];
        int j = p - 1;

        for(int i = p; i < r; i++){
            if(A[i] <= temp) {
                j++;
                change(A,i,j);
            }
        }
        change(A,r,j+1);

        return j + 1;
    }

    public static void change(int A[],int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    public static int randomizedPartition(int A[], int p, int r) {
        int i = new Random().nextInt(r+1);
        change(A,i,r);
        return partition(A,p,r);
    }

    public static int randomizedSelected(int A[], int p, int r, int i){
        if(p == r) {
            return A[p];
        }

        int q = randomizedPartition(A, p ,r);
        int k = q - p - 1;
        if(i == k) {
            return A[q];
        } else if(i < k) {
            return randomizedSelected(A,p,q-1,i);
        } else {
            return randomizedSelected(A,q+1,r,i-k);
        }


    }
}
