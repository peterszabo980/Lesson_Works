package hu.progmatic;

import java.util.Scanner;

public class LW_20220302 {
    // psvm
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;
        int number3 = 2;

        /* összehasonlító operátorok
            > < >= <=
            ==
            !=
        */
        //System.out.println(number1 == number3);

        String text1 = "kiscica";
        String text2 = new String( "kiscica");// String-et létre lehet hozni így is, de NE!!!
        System.out.println(text1 == text2); // hiába ugyanaz az értékük, ez az összehasonlítás nem működik!
        System.out.println(text1.equals(text2));// szövegeket ilyen módon hasonlítunk össze

        // == számok összehasonlítására
        // .equals() szövegek összehasonlítására

        // ----------------------------------------------------------------------------------------

        // ez egy SOR komment - csak egy sor lehet

        /*
            ez egy BLOKK komment
            akárhány
            sor
            lehet
         */

        // ----------------------------------------------------------------------------------------

        // primitív egész szám adattípus: byte short int long
        // milyen adatokat tároljunk egész számként? pl.: felhasználó életkora, emelet, ajtószám

        // ----------------------------------------------------------------------------------------

        // törtek: float, double
        // milyen adatokat tároljunk törtszámként? pl.: tulajdonjog hányad, valószínűség, PI értéke
        // fontos megjegyezni, hogy nem pontos!

        /* törtekre és "cast"-olásra példa
        float f = (float) 10 / 3F;
        double d = (double) 10 / 3D;
        int i = 10 / 3;     // értéke: 3 - a tizedespont utáni részt egyszerűen elhagyja

        System.out.println(f);
        System.out.println(d);
        */

        // ----------------------------------------------------------------------------------------

        // char - egy darab karakter
        /* karakterek összefűzése
         */
        char a = 'A';
        char b = 'B';

        char c = 65;
        /*
        System.out.println(a + b);                  // számként kezeli a char-okat
        System.out.println(a + "" + b);             // szövegként kezeli a char-okat
        System.out.println(String.valueOf(a) + b);  // szöveggé alakítás
        */

        // ----------------------------------------------------------------------------------------

        // boolean - 2 értéke lehet: true / false

        /* boolean típusú változó értékadása
        boolean boolTrue = true;
        boolean boolFalse = false;
        boolean myBoolean = 2 < 3;
        */

        // ----------------------------------------------------------------------------------------

        /* mi lesz az eredmény?
        int number1 = 5;
        int number2 = 6;
        String text = "szöveg";

        System.out.println( number1 + number2 + text );   // 11szöveg - előbb a számokat adja össze, aztán fűzi szövegként össze
        System.out.println( text + number1 + number2 );   // szöveg56 - az egész kifejezést szövegként fűzi össze
        System.out.println( text + (number1 + number2) );   // szöveg11 - előbb a zárójelben lévő műveletet végzi, aztán fűzi össze szövegként
         */

        // ----------------------------------------------------------------------------------------

        System.out.println(a + "" + b);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérlek, add meg az első számot: ");
        int userNumber1 = scanner.nextInt();

        System.out.print("Kérlek, add meg a második számot: ");
        int userNumber2 = scanner.nextInt();

        System.out.println("A megadott számok összeadása egymással: " + (number1 + number2));
        System.out.println("A megadott számok osztása egymással: " + (number1 / number2));
        System.out.println("A megadott számok kivonása egymásból: " + (number1 - number2));
        System.out.println("A megadott számok szorzása egymással: " + (number1 * number2));


    }
}
