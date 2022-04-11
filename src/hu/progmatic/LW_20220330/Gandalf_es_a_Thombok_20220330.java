package hu.progmatic.LW_20220330;

import com.sun.source.tree.BreakTree;

public class Gandalf_es_a_Thombok_20220330 {
    public static void main(String[] args) {
        int[] dombok = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};
        int[] tomeg = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};

        int[] suly = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
        int[] magassag = {144, 130, 138, 135, 128, 130, 120, 125, 130, 110};
        System.out.println("1. feladat");
        System.out.println("A legnagyobb domb: " + legnagyobDomb(dombok));
        System.out.println();

        System.out.println("2. feladat");
        for (int i = 0; i < dombok.length; i++) {
            question(dombok, i);
        }

        System.out.println();
        System.out.println("3. feladat");
        System.out.println("A teljes átkelés " + bridge(tomeg) + " percig tartott.");

        System.out.println();
        System.out.println("4. feladat");
        System.out.println(torony(suly));
        System.out.println(torony(magassag));
        System.out.println();
        System.out.println("5. feladat");

        System.out.println();
        System.out.println("6. feladat");
    }
    /*
    Segíts Gandalfnak megtalálni a legmagasabb dombot! Írj metódust,
    ami megkeresi egy tömb legnagyobb elemét!
     */
    public static int legnagyobDomb (int[] dombok) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dombok.length; i++) {
            if (dombok[i] > max) {
                max = dombok[i];
            }
        } return max;
    }

    /*
    Írj metódust, ami válaszol Gandalf kérdésére, vagyis egy tömb bármely
    eleménél képes megmondani, hogy melyik lesz a következő legnagyobb elem (beleértve önmagát is).
        Pl.
        {3, 14, 6, 10, 5, 7}
        az 1. indexen „állva” az 1. index eleme a legnagyobb (14)
        a 2. indexen „állva” a 3. index eleme a legnagyobb (10)
        a 4. indexen „állva” az 5. index eleme a legnagyobb (7)
     */

    public static int question(int[] next, int a) {
        int max = Integer.MIN_VALUE;
        int b = 0;
        int c = 0;
        for (int i = a; i < next.length; i++) {
            if (next[i] >= max) {
                b = i;
                max = next[i];
            }
        }
        System.out.println("A(z) " + a + ". indexen (" + next[a] + ") következő legnagyobb a " + max + " ,ami a(z) " + b + ". indexen van.");
        return max;
        }



    /*
    A dombokon átkelve vándoraink megérkeztek Gundabad hegyéhez. A barlang bejáratához egy
    meglehetősen viharverte függőhíd vezetett. Gandalf úgy tippelte, hogy a híd maximum 150 kg-t bír el.
    Gandalf éppenséggel tud lebegni és lebegtetni is, a törpök azonban köztudomásúlag utálják a repülést.
    Egy törpként kijelentették, hogy ők bizony inkább vágnák le a szakállukat, mintsem hogy bárki is megreptesse őket.
    Szolidaritásból Gandalf sem repült, hanem közösen úgy határoztak, hogy súly szerint sorba állnak, és először a
    legkönnyebb és a legnehezebb megy át, utána a második legkönnyebb és a második legnehezebb és így tovább. Ha
    valamelyik pár nehezebb 150 kg-nál, akkor ők egyesével mennek át. Egy személy, ill. egy pár 5 perc alatt kelt át a
    hídon. Hány percig tartott a teljes átkelés?

    Írj programot, ami válaszol a kérdésre! A tömbök (és Gandalf) súlyát az alábbi törp tartalmazza:
    {84, 83, 82, 76, 61, 70, 58, 67, 72, 85}
     */

    public static int bridge(int[] tomeg) {
        //int time = 0;
        int timer = 0;
        for (int i = 0; i < tomeg.length; i++) {
            for (int j = 0; j < tomeg.length - j - 1; j++) {
                if (tomeg[j] > tomeg[j + 1] ) {
                    int csere = tomeg[j];
                    tomeg[j] = tomeg[j + 1];
                    tomeg[j + 1] = csere;
                }
            }
        }

        for (int i = 0; i < tomeg.length / 2; i++) {
            int a = tomeg[i] + tomeg[tomeg.length - i - 1];
            if (a < 150) {
                timer += 5;
            } else {
                timer += 10;
            }

        }
        return timer;
    }

        /*
 84, 144}, {83, 130}, {82, 138}, {76, 135},
                {61, 128}, {70, 130}, {58, 120}, {67, 125},
                {72, 130}, {85, 110}};
         */

 public static int torony(int[] ujtorony) {
     int retesz = 0;
     for (int i = 0; i < ujtorony.length; i++) {
         for (int j = 0; j < ujtorony.length - j - 1; j++) {
             if (ujtorony[j] > ujtorony[j] ) {
                 int csere = ujtorony[j];
                 ujtorony[j] = ujtorony[j];
                 ujtorony[j] = csere;
             }
         } //return retesz;
     }return retesz;
 }

}
