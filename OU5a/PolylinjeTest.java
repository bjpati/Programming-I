package OU5a;
import static java.lang.System.out;
public class PolylinjeTest
{

        public static void main (String[] args) {
            // TODO Auto-generated method stub
            // Iterator
            Polylinje pl1 = new Polylinje(new Punkt[] {
                    new Punkt("A", 1, 2),
                    new Punkt("B", 3, 0),
                    new Punkt("C", 5, 4),
            });
            Polylinje.PolylineIterator iterator = pl1.new PolylineIterator();

            while(iterator.cornerExists()) {
                out.println(iterator.corner());
                iterator.next();
            }
        }

    }
