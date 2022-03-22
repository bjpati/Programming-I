package OU5a;
import java.io.PrintWriter;

public class PunktTest
{
    public static void main (String[] args)
    {
            // TODO Auto-generated method stub
            PrintWriter out = new PrintWriter (System.out, true);
            // testa en konstruktor och en transformator
            Punkt p1 = new Punkt ("A", 3, 4);
             Punkt p2 = new Punkt ("B", 5, 6);
            out.println (p1 + " " + p2);
            // testa inspektorer
            String n = p1.getName();
            int x = p1.getX ();
            int y = p1.getY ();
            out.println (n + " " + x + " " + y);
            // testa en kombinator och en komparator
            double d = p1.distance(p2);
            out.println (d);
            boolean b = p1.equals (p2);
            out.println (b);
            // testa mutatorer
            p2.setX (1);
            p2.setY (2);
            out.println (p2);
            // testa en konstruktor till
            Punkt p = new Punkt (p1);
            out.println (p);
    }
}


