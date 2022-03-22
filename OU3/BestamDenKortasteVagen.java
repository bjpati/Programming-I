package OU3;
import java.util.Scanner;
public class BestamDenKortasteVagen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //antal stationer i zonen2
        System.out.println("Ange antal mellanstationerna i zonen 2:");
        int m = in.nextInt();
        //antal stationer i zonen3
        System.out.println("Ange antal mellanstationerna i zonen 3:");
        int n = in.nextInt();

        //deklerera avståden mellan zonerna som vektorer
        double[] a = new double[m + 1];
        double[][] b = new double[m + 1][n + 1];
        double[] c = new double[n + 1];

        //mata in längder av ai
        System.out.println("Ange längdar från mellanstatione X i " +
                           "zonen 1 till varje mellanstation i zonen 2");
        for (int i = 1; i <= m; i++)
        {
            double ai = a[i];
            a[i] = in.nextDouble();
        }
        //mata in längder av bij
        System.out.println("Ange längdar från varje mellan station i" +
                           " zonen 2 till varje mellanstation i zonen 3");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                double bij = b[i][j];
                b[i][j] = in.nextDouble();
            }
        }

        //mata in längder av cj
        System.out.println("Ange längdar från varje mellan station i zonen 3 "
                + "till  mellanstation Y i zonen 4");
        for (int j = 1; j <= n; j++) {
            double cj = c[j];
            c[j] = in.nextDouble();
        }
        int mellanstationer[] = DenKortasteVagen.mellanstationerna(a, b, c);
        double lang = DenKortasteVagen.langd(a, b, c);
        System.out.println("\nKortaste vägen är: \n" +
                "Zon 1 till Zon 2 - Station " + mellanstationer[0] + " är " + a[mellanstationer[0]] + " lång. \n"
                + "Zon 2 - Station " + mellanstationer[0] + " till Zon 3 - Station " + mellanstationer[1] + " är "
                + b[mellanstationer[0]][mellanstationer[1]] + " lång. \n" + "Zon 3 - Station " + mellanstationer[1]
                + " till Zon 4 är " + c[mellanstationer[1]] + " lång. \nTotal minsta väg sträcka: " + lang);

    }
}