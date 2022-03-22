package OU3;

public class DenKortasteVagen {
    // mellanstationer returnerar en vektor med de mellanstationersom finns på den kortaste
    // vägen. Ordningsnummerav den förstamellanstationen finns på index1, ochordningsnummer
    //avden andra mellanstationen på index2 i vektorn.
    public static int[] mellanstationerna(double[] a, double[][] b, double[] c) {
        int mellanstationer[] = {1, 1};
        double min = a[1] + b[1][1] + c[1];
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = 1; j <= c.length - 1; j++) {
                if (min > a[i] + b[i][j] + c[j]) {
                    min = a[i] + b[i][j] + c[j];
                    mellanstationer[0] = i;
                    mellanstationer[1] = j;
                }
            }
        }
        return mellanstationer;
    }

    // langd returnerar längden av den kortaste vägen.
    public static double langd(double[] a, double[][] b, double[] c) {
        int[] mellanstationer = mellanstationerna(a, b, c);
        double lang = ((a[mellanstationer[0]]) +
                (b[mellanstationer[0]][mellanstationer[1]]) + (c[mellanstationer[1]]));
        return lang;

    }
}