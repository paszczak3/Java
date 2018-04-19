import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tab[] = new int[4];

        System.out.println("Podaj 4 liczby ktore beda okreslaly wartosc sekretarki ");
        for(int i = 0; i<tab.length; i++) {
            tab[i] = sc.nextInt();
            sc.nextLine();
        }


        tab = permuteBySorting(tab);  //sortowanie po innej tablicy

        int best = hireAssistant(tab);
        System.out.println("best = " + best);

        sc.close();

    }

    static int hireAssistant(int tab[]) {   // szukanie maxa w tablicy
        int best = 0;
        for(int i = 0; i<tab.length; i++) {
            if(tab[i] > best)
                best = tab[i];
        }
        return best;
    }

    static int[] permuteBySorting(int tab[]) {
        Sort toSort[] = new Sort[tab.length];   //referencja na obiekt tablicowy klasy Sort
        //short tab2[] = new short[tab.length];

        //konstruktor  pierwszy parametr i(index) drugi losowa wartosc
        // sort.value = losowanie
        // sort.index = i;
        for(int i = 0; i<toSort.length; i++) {
            toSort[i] = new Sort((short) i,(short) new Random().nextInt(Short.MAX_VALUE + 1));
            //tab2[i] = (short) new Random().nextInt(Short.MAX_VALUE + 1);
        }


        //wypisanie tej tablicy
        for(int i = 0; i< toSort.length; i++) {
            System.out.println("index = " + toSort[i].getIndex() + " value = " + toSort[i].getValue());
        }

        //wypisanie tablicy ktora otrzymujesz w funkcji
        System.out.println(Arrays.toString(tab) + " Tablica co przyszla z funkcji ktora trzeba pomieszac");

        System.out.println("");
        System.out.println("Zmiana kolejnosci patrz index ");
        System.out.println("");
        //sortowanie value od najmniejszej do najwiekszej
        Arrays.sort(toSort);


        //wypisanie pomieszanego value  i indexow
        for(int i = 0; i< toSort.length; i++) {
            System.out.println("index = " + toSort[i].getIndex() + " value = " + toSort[i].getValue());
        }

        System.out.println("");


        //podstawienie do sort.value wartosci w odpowienie miejsca  z tablicy ktora przychodzi w funkcji
        for(int i = 0; i<tab.length; i++) {
            //int index = toSort[i].getIndex();
             //toSort[toSort[i].getIndex()].setValue((short) tab[i]);
            toSort[toSort[i].getIndex()].setValue((short) tab[i]);
        }


        System.out.println("lepsza kolejnosc ");
        // podmieniam znow wartosci tym razem w tab zeby moc ja pozniej zwrocic po prostu tab = toSort.value
        for(int i = 0; i< toSort.length; i++) {
            tab[i] = toSort[i].getValue();
            //wypisanie sort.value to samo co tab linijka wyzej
            System.out.println( "value = " + toSort[i].getValue());
        }


        //wypisanie tab
        //duzo lepsza kolejnosc niz ta pechowa 1 2 3 4
        System.out.println("");
        System.out.println("Ostatnie wyswietlenie zwracanej tablicy: " + Arrays.toString(tab));

        //zwracam tab
        return tab;
    }
}

class Sort implements Comparable<Sort>{
    private short index;
    private short value;

    public Sort() {
    }

    public Sort(short index, short value) {
        this.index = index;
        this.value = value;
    }



    @Override
    public String toString() {
        return "Sort{" +
                "index=" + index +
                ", value=" + value +
                '}';
    }

    public short getIndex() {
        return index;
    }


    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }

    @Override
    public int compareTo(Sort o) {
        return this.value - o.value;
    }
}
