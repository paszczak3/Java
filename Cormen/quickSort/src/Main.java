import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tab[] = {2,8,7,1,3,5,6,4};

        //change(tab,3,1);
        //System.out.println(Arrays.toString(tab));

       //partition(tab,0,tab.length-1);
       //System.out.println(Arrays.toString(tab));

        quickSort(tab,0,tab.length-1);
        System.out.println(Arrays.toString(tab));
    }

    public static void quickSort(int A[], int p, int r) {
        int q = 0;
        if(p < r) {
            q = partition(A,p,r);
            quickSort(A,p,q-1);
            quickSort(A,q+1,r);
        }
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
}
