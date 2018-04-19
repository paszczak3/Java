public class Czlowiek implements Comparable<Czlowiek>{
 
    private char plec;
    private String imie;
    private String nazwisko;

    public Czlowiek() {
    }

    public Czlowiek(char plec, String imie, String nazwisko) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }



    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return nazwisko + " " + imie+" (" + plec +")" ;
    }


    @Override
    public int compareTo(Czlowiek o) {
        int porownanie =  nazwisko.compareTo(o.nazwisko);
        return porownanie;
    }
}