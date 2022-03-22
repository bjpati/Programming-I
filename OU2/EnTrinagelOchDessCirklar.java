package OU2;

public class EnTrinagelOchDessCirklar
{
        public static void main (String[] args)
        {
            //koden för alla beräkningar
            double triangelomkrets = Triangel.omkrets(1, 2, 3);
            double traingelarea = Triangel.area(2, 8);
            double triangelbis = Triangel.bisektris(5, 2, 3);
            double vMedina = Triangel.median(10, 5, 7);
            double area_tre_sidor = Triangel.areaTreSidor(5, 6, 9);
            double inRadian = Triangel.inskrivencirkel(2, 6, 6);
            double omskrivencirkel = Triangel.omskrivencirkel(3,4 , 5);

            //visa beräkningar
            System.out.println("Triangelomkrets: " + triangelomkrets);
            System.out.println("Triangelarea: " + traingelarea);
            System.out.println("bisektris: " + triangelbis);
            System.out.println("vMedian: " + vMedina);
            System.out.println("Area med tre sidor: " + area_tre_sidor);
            System.out.println("Inskrivencirkel: " + inRadian);
            System.out.println("Omskrivencirkel: " + omskrivencirkel);
        }
}