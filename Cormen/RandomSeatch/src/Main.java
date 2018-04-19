import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int A[] = new int[10];
        for(int i = 0; i<A.length; i++) {
            A[i] = new Random().nextInt();
            System.out.println(A[i]);
        }

        int temp = 0;
        int lookingValue = A[4];
        int B[] = new int[A.length];

        searchRandom(lookingValue, A, temp,B);

    }

    public static void searchRandom(int lookingValue, int A[], int temp, int B[]) {
        int randomIndex = randomIndex(A.length);
        for(int i = 0; i<B.length; i++) {
            if(B[i] == randomIndex) {
                randomIndex = randomIndex(A.length);
                i=0;
            }
        }

        if(A[randomIndex]  == lookingValue) {
            temp++;
            System.out.println("temp = " + temp);
            System.out.println("szukana wartosc = " + lookingValue);
        } else {
            B[temp] = randomIndex;
            temp++;
            if(temp == 10) {
                System.out.println("Nie istnieje podana wartosc");
                return;
            }
            searchRandom(lookingValue, A,temp, B);
        }

    }


    public static  int randomIndex(int size){
        int temp = new Random().nextInt(size);
        return temp;
    }
}
