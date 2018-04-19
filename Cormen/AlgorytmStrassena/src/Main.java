public class Main {
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        A[0][0] = -2; A[0][1] = -3; A[0][2] = 1;
        A[1][0] = -1; A[1][1] = 4; A[1][2] = 0;
        A[2][0] = 0; A[2][1] = 0; A[2][2] = 0;

        B[0][0] = -2; B[0][1] = -1; B[0][2] = 2;
        B[1][0] = 3; B[1][1] = 0; B[1][2] = 1;
        B[2][0] = 2; B[2][1] = 2; B[2][2] = -1;

       int C[][];
        C = Main.SquareMatrixMultiply(A,B);

        for (int i = 0; i <C.length; i++) {
            for (int j = 0; j<C.length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }


    }
    //normalna metoda
    public static int[][] SquareMatrixMultiply(int A[][], int B[][]) {
        int C[][] = new int[3][3];
        for (int i = 0; i <C.length; i++) {
            for (int j = 0; j<C.length; j++) {
                C[i][j] = 0;
                for(int k = 0; k<C.length; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
}
