package pl.javastart.model;

public class ValueCalculate {
    private int wynik;

    public ValueCalculate() {
    }

    public ValueCalculate(int wynik) {
        this.wynik = wynik;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public void calculateAdd(int x ,int y) {
        this.wynik = x + y;
    }

    public void calculateSub(int x, int y) {
        this.wynik = x - y;
    }

    public void calculateMul(int x, int y) {
        this.wynik = x * y;
    }

    public void calculateDiv(int x, int y) {

    }
}
