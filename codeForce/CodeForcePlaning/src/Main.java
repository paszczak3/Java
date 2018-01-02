import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
        tab[] tablica = new tab[n];
        int arr[] = new int[n];
        int w = k;

        for(int i = 0; i<n; i++){
            tablica[i] = new tab(sc.nextInt(),i);
            arr[i] = ++w;
        }

        Arrays.sort(tablica, Collections.reverseOrder());


        for(int i = 0; i<n; i++){
                tablica[i].x = arr[i];
        }

        for(int i = 0; i<n; i++){
            System.out.print(tablica[tablica[i].indeks].x + " ");
        }

    }

    static class tab implements Comparable<tab> {
        int x;
        int indeks;

        public tab(int x, int indeks) {
            this.x = x;
            this.indeks = indeks;
        }

        @Override
        public int compareTo(tab o) {
            return (int)(this.x - o.x);
        }
    }
}



