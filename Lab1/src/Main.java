//34526
public class Main {
    public static void main(String[] args) {
        short[] a = new short[7];
        for (int i = 0; i < 7; i++) {
            a[i] = (short)(4 + (i * 2));
        }

        double[] x = new double[20];
        //( Math.random() * (b-a) ) + a
        for (int i = 0; i < 20; i++) {
            x[i] = (Math.random() * (7.0 + 7.0)) + -7.0;
        }

        double[][] c = new double[7][20];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 20; j++) {
                if (a[i] == 4) {
                    c[i][j] = Math.pow(Math.E, Math.pow(Math.pow(x[j],((1 / 3.0) + x[j]) / 2),(Math.pow((x[j] / 3), 3)) / 2));
                } else if (a[i] == 6 || a[i] == 8 || a[i] == 12) {
                    c[i][j] = Math.pow((2 * Math.log(Math.abs(x[j]))) , 3);
                } else {
                    c[i][j] = Math.pow((2.0 / 3) / (1 - (Math.pow((2 * (3 - Math.asin(Math.sin(x[j])))), 2))), 2);
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%-15.2f ", c[i][j]);
            }
            System.out.println();
        }

    }
}