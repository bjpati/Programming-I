package OU2;

public class Triangel
{
        //beräkna omkrets
        public static double omkrets (double x1, double x2, double x3)
        {
            double triangelomkrets = x1 + x2 + x3;
            return triangelomkrets;
        }

        //beräkna area
        public static double area (double y1, double y2)
        {
            double traingelarea = (y1 * y2) / 2;
            return traingelarea;
        }

        //beräkna bisektris
        public static double bisektris (double sidaA, double sidaB, double vinkelalfa)
        {
            double    p = 2 * sidaA * sidaB * Math.cos(vinkelalfa / 2);
            double    triangelsbis = p / (sidaA + sidaB);
            return    triangelsbis;
        }

        //beräkna median
        public static double median (double sida1, double sida2, double sidansmedian)
        {
            double    vMedian = Math.sqrt((2 * ((sida1 * sida1) + (sida2 * sida2)) -
                    (sidansmedian * sidansmedian))/4);
            return    vMedian;
        }

        public static double areaTreSidor (double sida1, double sida2, double sida3)
        {
            double    s = omkrets (sida1, sida2, sida3)/ 2;
            double    area_tre_sidor = Math.sqrt(s * (s-sida1) * (s-sida2) * (s-sida3));
            return    area_tre_sidor;
        }

        public static double inskrivencirkel (double sidaA, double sidaB, double sidaC)
        {
            double inskrivencirkel = ((sidaA + sidaB + sidaC) / 2);
            double inRadian = Math.sqrt(((inskrivencirkel - sidaA) * (inskrivencirkel - sidaB) *
                    (inskrivencirkel - sidaC)) / inskrivencirkel);
            return inRadian;
        }

        public static double omskrivencirkel (double sidaA, double sidaB, double sidaC)
        {
            double omskrivencirkel = ((sidaA + sidaB + sidaC) / 2);
            double namnaren = 4 * (Math.sqrt(omskrivencirkel * (omskrivencirkel - sidaA) * (omskrivencirkel - sidaB) *
                    (omskrivencirkel - sidaC)));
            double omRadian = ((sidaA * sidaB * sidaC) / namnaren);
            return omRadian;
        }
}