public class Grid {
    Node[] n  = new Node[GlobalClass.nh];
    Element[] e = new Element[ (GlobalClass.nh - 1)];
   // private double ne = GlobalClass.L/(GlobalClass.nh-1);
    private double temp = 0;



    public Grid() {
        double dx = 0;

        for(int i = 0;  i<n.length; i++) {
            n[i] = new Node(dx , 0);
            dx += GlobalClass.L / (GlobalClass.nh -1);

            if(i==0) {
                n[i].setStatus(1);
            }

            if(i == GlobalClass.nh -1) {
                n[i].setStatus(2);
            }
        }
    }


    public void putIn(){
        for(int i = 0; i<GlobalClass.nh -1; i++){
            e[i] = new Element();
            e[i].LP[0] = 0;
            e[i].LP[1] = 0;
            e[i].setK(GlobalClass.K);
            e[i].ID[0] = i;
            e[i].ID[1] = i + 1;

            System.out.println(e[i].ID[0]);

            System.out.println(e[i].ID[1]);


            this.temp = e[i].getS() * e[i].getK() / (this.n[ e[i].ID[1]].x - n[e[i].ID[0]].x);
            e[i].LH[0][0] =  this.temp;
            e[i].LH[0][1] = -this.temp;
            e[i].LH[1][0] = -this.temp;
            e[i].LH[1][1] =  this.temp;

            if(n[e[i].ID[0]].getStatus() == 2) {
                e[i].LH[0][0] += GlobalClass.alfa * e[i].getS();
            }
            if(n[e[i].ID[1]].getStatus() == 2) {
                e[i].LH[1][1] += GlobalClass.alfa * e[i].getS();
            }

        }


        for(int i = 0; i<GlobalClass.nh-1; i++) {
            if(n[e[i].ID[0]].getStatus() == 1) {
                e[i].LP[0] += -GlobalClass.q * e[i].getS();
            }
            if(n[e[i].ID[1]].getStatus() == 1) {
                e[i].LP[1] += -GlobalClass.q * e[i].getS();
            }
            if(n[e[i].ID[0]].getStatus() == 2) {
                e[i].LP[0] += GlobalClass.alfa * GlobalClass.tAlfa * e[i].getS();
            }
            if(n[e[i].ID[1]].getStatus() == 2) {
                e[i].LP[1] += GlobalClass.alfa * GlobalClass.tAlfa * e[i].getS();
            }
        }
    }


    public void putInToSoe(SOE soe) {
        for(int i = 0; i<GlobalClass.nh-1; i++){
            soe.GH[e[i].ID[0]][e[i].ID[0]] += e[i].LH[0][0];
            soe.GH[e[i].ID[0]][e[i].ID[1]] += e[i].LH[0][1];
            soe.GH[e[i].ID[1]][e[i].ID[0]] += e[i].LH[1][0];
            soe.GH[e[i].ID[1]][e[i].ID[1]] += e[i].LH[1][1];

            soe.GP[e[i].ID[0]] += e[i].LP[0];
            soe.GP[e[i].ID[1]] += e[i].LP[1];
        }
    }



}
