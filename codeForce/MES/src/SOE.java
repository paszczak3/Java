import java.util.Arrays;

public class SOE {
    StringBuilder sb = new StringBuilder();
    public  Double[][] GH = new Double[GlobalClass.nh][GlobalClass.nh];
    public  Double[] GP = new Double[GlobalClass.nh];
    public  Double[] GT  = new Double[GlobalClass.nh];

    public SOE() {

        for(int i = 0; i<GP.length; i++) {
            GP[i] = new Double(0);
            GT[i] = new Double(0);
        }

        for(int i = 0; i<GlobalClass.nh; i++) {
            for(int j = 0; j<GlobalClass.nh;j++){
                GH[i][j] = new Double(0);
            }
        }
    }

    public Double[][] getGH() {
        return GH;
    }

    public Double[] getGP() {
        return GP;
    }

    public Double[] getGT() {
        return GT;
    }

    public void setGH(Double[][] GH) {
        this.GH = GH;
    }

    public void setGP(Double[] GP) {
        this.GP = GP;
    }

    public void setGT(Double[] GT) {
        this.GT = GT;
    }

    public Double getGT2() {
        return GT[2];
    }

    @Override
    public String toString() {
        return "GT {" +
                " GT=" + Arrays.toString(GT) +
                '}';
    }

    public void printGH(){
        for(int i = 0; i<GH.length; i++){
            for(int j = 0; j< GH.length; j++){
                sb.append("GH [" + i + "] [" + j + "] " + GH[i][j] );
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }

    public void printGP(){
        for (Double d: GP) {
            System.out.print("GP [" + d +"] ");
        }
        System.out.println(" ");
    }
}
