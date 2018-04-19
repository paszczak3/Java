public class Element {
    int ID[];
    private double S;
    private double K;
    double LH[][];
    double LP[];

    public Element() {
        this.ID = new int[2];
        this.LH = new double[2][2];
        this.LP = new double[2];
        this.S = GlobalClass.S;
        this.K = GlobalClass.K;
    }

    public Element(int[] ID, double s, double k, double[][] LH, double[] LP) {
        this.ID = ID;
        S = s;
        K = k;
        this.LH = LH;
        this.LP = LP;
    }

    public int[] getID() {
        return ID;
    }


    public double getS() {
        return S;
    }

    public double getK() {
        return K;
    }


    public double[][] getLH() {
        return LH;
    }

    public double[] getLP() {
        return LP;
    }

    public void setID(int[] ID) {
        this.ID = ID;
    }


    public void setS(double s) {
        S = s;
    }

    public void setK(double k) {
        K = k;
    }


    public void setLH(double[][] LH) {
        this.LH = LH;
    }

    public void setLP(double[] LP) {
        this.LP = LP;
    }
}
