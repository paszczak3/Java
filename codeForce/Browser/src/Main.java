import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,pos,l,r;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); pos = sc.nextInt(); l = sc.nextInt();
        r = sc.nextInt();
        int time = 0;

        if(l == 1 && r == n) {
            System.out.println(0);
            return;
        }

        if( l == r) {
            if(l != 1 && l!= n) {
                time = Math.abs(pos - r);
                time = time + 2;
                System.out.println(time);
                return;
            }

            if(pos > r) {
                time = pos - r;
                time++;
                System.out.println(time);
                return;
            }

            time = r - pos;
            time++;
            System.out.println(time);
            return;
        }

        if(l != 1 && r != n) {
            if(pos <= l) {
                time = r - pos;
                time = time + 2;
                System.out.println(time);
                return;
            }

            if(pos >= r) {
                time = pos - l;
                time = time + 2;
                System.out.println(time);
                return;
            }

            if(pos < r && pos > l) {
                double w = (double) (l + r) / 2;
                if(pos == w) {
                    time = r - pos + r - l;
                    time = time + 2;
                    System.out.println(time);
                    return;
                } else {
                    if(pos - l > r - pos) {

                        time = r - pos + r - l;
                        time = time + 2;
                        System.out.println(time);
                        return;
                    } else {
                        time = pos - l + r - l;
                        time = time + 2;
                        System.out.println(time);
                        return;
                    }
                }
            }
        }

        if(l == 1) {
            time =  Math.abs(pos - r);
            time++;
            System.out.println(time);
            return;
        }

        if(r == n) {
            if(pos < l) {
                time = l - pos;
                time++;
                System.out.println(time);
                return;
            }
            time = pos - l;
            time++;
            System.out.println(time);
            return;
        }


    }
}
