import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int A[] = {2,5,3,0,2,3,0,3};
        int B[] = new int[A.length];
        int k = 6;
        countingSort(A,B,k);
    }

    public static void countingSort(int A[], int B[], int k ) {
        int C[] = new int[k];
        for(int i = 0; i < k; i++) {
            C[i] = 0;
        }

        for(int j = 0; j<A.length; j++) {
            C[A[j]] = C[A[j]] + 1;
        }

        for(int i = 1; i < k; i++) {
            C[i] = C[i] + C[i - 1];
        }
        System.out.println(Arrays.toString(C));

        for(int i = (A.length -1); i > 1; i--) {
            B[C[A[i]]] = A[i];
            C[A[i]] = C[A[i]] - 1;
        }

        System.out.println(Arrays.toString(B));
    }
}
