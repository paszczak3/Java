package pl.javastart.model;

public class ValueCalculate {
    private double calculate;

    public ValueCalculate() {
    }

    public ValueCalculate(double calculate) {
        this.calculate = calculate;
    }

    public double getCalculate() {
        return calculate;
    }

    public void setCalculate(double calculate) {
        this.calculate = calculate;
    }

    public void calculateAdd(int x, int y){
        this.calculate = x + y;
    }

    public void calculateSub(int x, int y){
        this.calculate = x - y;
    }

    public void calcuateMul(int x, int y){
        this.calculate = x * y;
    }

    public void calculateDiv(int x, int y){
        this.calculate = x / y;
    }
}
