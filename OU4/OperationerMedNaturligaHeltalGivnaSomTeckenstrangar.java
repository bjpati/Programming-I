package OU4;

import java.util.Scanner;
import static java.lang.System.out;

public class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar
{
    public static void main(String[] args) {
        out.println("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR000s\n");
        // mata in två naturliga heltal
        Scanner in = new Scanner(System.in);
        out.println("Ange två naturliga heltal:");
        String tal1 = in.next();
        String tal2 = in.next();
        out.println();

        // addera heltalen och visa resultatet
        String summa = addera(tal1, tal2);
        visa(tal1, tal2, summa, '+');

        // subtrahera heltalen och visa resultatet
        // koden här
        out.println();
        String differens = subtrahera(tal1, tal2);
        visa(tal1, tal2, differens, '-');
    }

    // addera tar emot två naturliga heltal givna som teckensträngar, och returnerar deras
    // summa som en teckensträng.
    public static String addera(String tal1, String tal2)
    {
        StringBuilder tal = new StringBuilder();
        int minnessiffra = 0;

        //gör tal1 och tal2 har samma längd med metoden SattlenSub
        if (tal1.length() > tal2.length())
            tal2 = sattLenSub(tal1, tal2);
        //går igrnom tal1 siffror med hjälp av for loop
        for (int i = tal1.length() - 1; i >= 0; i--)
        {
            int siffra1 = (tal1.charAt(i) + minnessiffra  - 48);
            int siffra2 = (tal2.charAt(i) - 48);
            int sum = siffra1 + siffra2;

            //siffran i tal 1 större än siffran i tal 2
            if (sum <= 9)
            {
                sum = siffra1 + siffra2;
                minnessiffra=0;
            }
            //om siffran i tal 1 är inte större än siffran i tal 2
            else
                {
                sum  = sum % 10;
                minnessiffra = 1;
            }


            tal.append(String.valueOf(sum));
        }
        //justerare resultaten genom att vända på den
        if(minnessiffra > 0)
            tal.append(String.valueOf(minnessiffra));
        tal.reverse();
        return tal.toString();
    }

    // subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar // deras differens som en teckensträng.
    // Det första heltalet är inte mindre än det andra heltalet.
    public static String subtrahera(String tal1, String tal2)
    {
        StringBuilder tal = new StringBuilder();
        int minnessiffra = 0;


        //gör tal1 och tal2 har samma längd med metoden SattlenSub
        if (tal1.length() > tal2.length())
            tal2 = sattLenSub(tal1, tal2);
        //går igrnom tal1 siffror med hjälp av for loop
        for (int i = tal1.length() - 1; i >= 0; i--)
        {
            int siffra1 = (tal1.charAt(i) - minnessiffra - 48);
            int siffra2 = (tal2.charAt(i) - 48);
            int sum;
            //siffran i tal 1 större än siffran i tal 2
            if (siffra1 >= siffra2)
            {
                sum = siffra1 - siffra2;
                minnessiffra = 0;
            }
            //om siffran i tal 1 är inte större än siffran i tal 2
            else
                {
                sum = (siffra1 + 10) - siffra2;
                minnessiffra = 1;
                }

            tal.append(String.valueOf(sum));
        }
        //justerare resultaten genom att vända på den
        tal.reverse();


        return tal.toString();
    }

    // koden ska skrivas här
    // visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation // utförd i samband med hetalen
    public static void visa(String tal1, String tal2, String resultat, char operator)
    {
        // sätt en lämplig längd på heltalen och resultatet
        int len1 = tal1.length();
        int len2 = tal2.length();
        int len = resultat.length();
        int maxLen = Math.max(Math.max(len1, len2), len);
        tal1 = sattLenAddtion(tal1, maxLen - len1);
        tal2 = sattLenAddtion(tal2, maxLen - len2);
        resultat = sattLenAddtion(resultat, maxLen - len);

        // visa heltalen och resultatet
        out.println("  " + tal1);
        out.println("" + operator + " " + tal2);

        for (int i = 0; i < maxLen + 2; i++)
            out.print("-");
        out.println();
        out.println(" " + resultat + "\n");

    }


    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng
    public static String sattLenAddtion(String s, int antal)
    {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < antal; i++)
            sb.insert(0, " ");
        return sb.toString();
    }

    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng
    public static String sattLenSub(String s, String antal)
    {
        int j = s.length() - antal.length();
        for (int i = 0; i < j; i++)
            antal = 0 + antal;

        return antal.toString();
    }
}
