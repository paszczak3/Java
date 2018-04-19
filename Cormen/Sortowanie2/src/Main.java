import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Czlowiek> ludzie = new ArrayList<Czlowiek>();
        ludzie.add(new Czlowiek('K', "Asia", "Wczorajsza"));
        ludzie.add(new Czlowiek('M', "Marcin", "Nikczemny"));
        ludzie.add(new Czlowiek('M', "Slawek", "Abacki"));
        ludzie.add(new Czlowiek('K', "Kasia", "Borowik"));
        ludzie.add(new Czlowiek('K', "Dorota", "Borowik"));
        ludzie.add(new Czlowiek('M', "Tomek", "Daszek"));
        ludzie.add(new Czlowiek('K', "Ania", "Daszek"));


        Collections.sort(ludzie);
        for(Object object: ludzie) {
            System.out.println(object);
        }

        System.out.println("");

        Collections.sort(ludzie, new Comparator<Czlowiek>() {
            @Override
            public int compare(Czlowiek o1, Czlowiek o2) {
                return -(o1.getPlec() - o2.getPlec());

            }
        });

        //Collections.sort(ludzie, (o1, o2) -> -o1.compareTo(o2));

        for(Object object: ludzie) {
            System.out.println(object);
        }


        List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");

        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        names.forEach(arg -> System.out.println(arg));

        Integer tab[] = new Integer[10];
        for(int i = 0; i<10; i ++) {
            tab[i] = new Random().nextInt(100);
        }


        Arrays.sort(tab, (x,y) -> -x.compareTo(y));
        System.out.println(Arrays.toString(tab));



        Scanner sc = new Scanner(System.in);
        char letters[] = new char[10];

        System.out.println("Podaj 10 liter");

        for(int i = 0; i<letters.length; i++){
            letters[i] = sc.next().charAt(0);
        }

        //System.out.println(Arrays.toString(letters));

        for(int i = 0; i<letters.length; i++) {
            letters[i]++;
        }

        System.out.println("Zaszyfrowana wiadomosc: ");
        System.out.println(Arrays.toString(letters));

        for(int i = 0; i<letters.length; i++) {
            letters[i]--;
        }

        System.out.println("Odeszyfrowana wiadomosc: ");
        System.out.println(Arrays.toString(letters));

        Czlowiek czlowiek1 = new Czlowiek('M',"Adam","Pyrtek");
        Czlowiek czlowiek2 = new Czlowiek();

        czlowiek2 = czlowiek1;
        czlowiek1.setImie("Kazek");

        System.out.println(czlowiek1.getImie() + " " + czlowiek2.getImie());




    }
}
