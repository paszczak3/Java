public class Main {
    public static void main(String[] args) {
        GlobalClass globalClass = new GlobalClass();
        Grid grid = new Grid();
        grid.putIn();
        SOE soe = new SOE();
        grid.putInToSoe(soe);
        soe.GT = lsolve(soe.GH,soe.GP);


        System.out.print(soe.toString());
        System.out.println("");
        soe.printGH();
    }


    public static Double[] lsolve(Double[][] A, Double[] b) {
        double EPSILON = 1e-10;
        int n = b.length;

        for (int p = 0; p < n; p++) {
            int max = p;
            for (int i = p + 1; i < n; i++) {
                if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                    max = i;
                }
            }
            Double[] temp = A[p]; A[p] = A[max]; A[max] = temp;
            double   t    = b[p]; b[p] = b[max]; b[max] = t;


            if (Math.abs(A[p][p]) <= EPSILON) {
                throw new ArithmeticException("Macierz jest pojedyncza.");
            }

            for (int i = p + 1; i < n; i++) {
                double alpha = A[i][p] / A[p][p];
                b[i] -= alpha * b[p];
                for (int j = p; j < n; j++) {
                    A[i][j] -= alpha * A[p][j];
                }
            }
        }

        Double[] x = new Double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }
        return x;
    }
}
