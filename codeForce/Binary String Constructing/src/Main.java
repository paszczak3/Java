import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int x = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();

        if(a == 1 && x == 2) {
            sb.append(1);
            sb.append(0);
            for (int i = 0; i < b - 1; i++) {
                sb.append(1);
            }

            System.out.println(sb.toString());
            System.exit(0);
        }

        if (b == 1 && x == 2) {
            sb.append(0);
            sb.append(1);
            for (int i = 0; i < a - 1; i++){
                sb.append(0);
            }

            System.out.println(sb.toString());
            System.exit(0);
        }



        if (x == 1) {
            for (int i = 0; i < a; i++) {
                sb.append("0");
            }

            for (int i = 0; i < b; i++) {
                sb.append("1");
            }
            System.out.println(sb.toString());
            System.exit(0);

        } else {
            if (x %2 == 0) {
                if (a > b) {
                    for (int i = 0; i < x / 2; i++) {
                        sb.append(0);
                        sb.append(1);
                    }

                    for (int i = 0; i < b - (x / 2); i++) {
                        sb.append(1);
                    }

                    for (int i = 0; i < a - (x / 2); i++) {
                        sb.append(0);
                    }
                }

                if (a <= b) {
                    for (int i = 0; i < x / 2; i++) {
                        sb.append(1);
                        sb.append(0);
                    }

                    for (int i = 0; i < a - (x / 2); i++) {
                        sb.append(0);
                    }

                    for (int i = 0; i < b - (x / 2); i++) {
                        sb.append(1);
                    }
                }
            } else {
                if (a > b) {
                    for (int i = 0; i < x / 2; i++) {
                        sb.append(0);
                        sb.append(1);
                    }

                    for (int i = 0; i < a - (x / 2); i++) {
                        sb.append(0);
                    }

                    for (int i = 0; i < b - (x / 2); i++) {
                        sb.append(1);
                    }
                }

                if (a <= b) {
                    for (int i = 0; i < x / 2; i++) {
                        sb.append(1);
                        sb.append(0);
                    }

                    for (int i = 0; i < b - (x / 2); i++) {
                        sb.append(1);
                    }

                    for (int i = 0; i < a - (x / 2); i++) {
                        sb.append(0);
                    }

                }
            }
        }


        System.out.println(sb.toString());
    }


}