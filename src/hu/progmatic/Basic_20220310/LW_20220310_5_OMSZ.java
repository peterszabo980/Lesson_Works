package hu.progmatic.Basic_20220310;

import java.util.Scanner;

public class LW_20220310_5_OMSZ {
    public static void main(String[] args) {
        /*

        5. OMSZ közbeszerzés
        Az OMSZ (Országos Meteorológiai Szolgálat) egy eu-s közbeszerzés keretében megbízott bennünket,
        hogy fejlesszük tovább a napi hőmérsékleteket tároló informatikai rendszerét.
        A továbbiakban egész számra kerekítve szeretnénk a hőmérsékleteket tárolni,
        viszont nem mindig csak az utolsó 10 napot, hanem a konkrét napok bekérése előtt kérdezzük meg a felhasználótól,
        hogy hány nap adatát szeretnénk tárolni.
        FIGYELEM: A fejlesztésre maximum 1 nap áll rendelkezésre.
        Minden további nap 1 MFt kötbérrel csökkentik a 100MFt-s megbízási díjat.
        */
        Scanner scanner = new Scanner(System.in);
        //double[] homersekletek = {3.2, -2.1, 5.0, 2.1, -1.7, 12.2, 10.0, 25.6, 11.0, -3.5};
        /*
        System.out.print("Hány nap adatát szeretné tárolni? ");
        int napok = scanner.nextInt();
        scanner.nextLine();
        int[] homersekletek = new int[napok];

        //homersekletek.length == napok;

        for (int i = 0; i < homersekletek.length; i++) {
            System.out.print("Kérem a(z) " + (i + 1) + ". nap értékét!");
            homersekletek[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.print("A tárolni kívánt napk száma: " + napok);
        System.out.println("");
        for (int i = 0; i < homersekletek.length; i++) {
            System.out.print("A tárolni kívánt hőmérséklet adatok a következőek: " + homersekletek[i] + " ");
        }
        */

        /*
        6. OMSZ 2. rész
        Az előző informatikai beruházás sikerén felbuzdulva az informatikáért felelős dolgozók meggyőzik a feletteseiket,
        hogy többet kell informatikai fejlesztésekre fordítani.
        Fejlesszük tovább az előző bekérést úgy, hogy egy sorban (scanner.nextLine()) szóközzel elválasztva kérjük be a számokat.
        (Pl. "12 34 33 21")
        A bekért szöveget a Stringet "abc def ghi".split(" ") metódusával bontsuk napi értékekre,
        majd az Integer.parseInt metódus segítségével alakítsuk át egyesével egész számmá.
        Az egész számokat mentsük el egy egész számokat tartalmazó tömbbe.

        A további feladatokat a beolvasott egész számokkal kell megoldani.

        */

        System.out.println("Kérem a hőmérsékleteket space-el (határolóval) elválasztva!");
        String bemenet = scanner.nextLine();
        String[] adatok = bemenet.split(" "); // széttördeljük a string-et a szóközök mentén
        int[] homersekletek = new int[adatok.length]; // stringet tartalmazó tömböt kaptunk

        // int szam = "123"; Ez így hibás, mert szöveget nem lehet elmenteni szám változóba!!!
        //int szam = Integer.parseInt("123"); szöveget számmá alakítja

        for (int i = 0; i < homersekletek.length; i++) {
            homersekletek[i] = Integer.parseInt(adatok[i]); // a megadott (számot, ami szövegként lett megadva) szöveget átalakítja számmá
        }
        System.out.println("Vége");

        /*
        7. Fagyos napok száma
        Hány olyan nap volt a beolvasott napok között, amikor a hőmérséklet negatív volt?
        Írjuk ki a helyes értéket.
        */

        int negativ = 0;

        for (int i = 0; i < homersekletek.length; i++) {
            if (homersekletek[i] < 0) {
                negativ ++;
            }
        }
        System.out.println("A fagypont alatti napok száma: " + negativ);

        /*
        8. Forró napok száma
        Hány olyan nap volt a beolvasott napok között, amikor a hőmérséklet elérte vagy meghaladta a 30 fokot?
        Írjuk ki a helyes értéket.
        */
        int forro = 0;

        for (int i = 0; i < homersekletek.length; i++) {
            if (homersekletek[i] >= 30) {
                forro ++;
            }
        }
        System.out.println("A 30C-fok feletti napok száma: " + forro);

        /*
        9. Átlag hőmérséklet
        Mennyi volt az átlagos hőmérséklet?
        Mennyi volt az átlagos hőmérséklet, ha nem szeretnénk az eredményt csonkolni (pl. 3 / 2 = 1.5 vagy 1 (egészosztás esetén))?
        */

        int osszeg = 0;

        for (int i = 0; i < homersekletek.length; i++) {
                osszeg += homersekletek[i];
        }
        int atlagInt = osszeg / homersekletek.length;
        double atlagDouble = (double) osszeg / homersekletek.length;
        System.out.println("Az átlagos hőmérséklet: " + atlagInt);
        System.out.println("A nem kerekített átlagos hőmérséklet: " + atlagDouble);

        /*
        10. Volt nagyon hideg nap?
        Volt olyan nap, amikor a hőmérséklet maximum -10 fok volt?
        Ne keressünk tovább, ha tudjuk a választ.
        Írjuk ki a választ.
        break; !!!
        */
        int nap = 0;
        int hideg = 0;
        for (int i = 0; i < homersekletek.length; i++) {
            if (homersekletek[i] <= -10) {
                hideg = homersekletek[i];
                nap = i;
                break;
            }
        }

        System.out.println("A(z) " + nap + ". napon már " + hideg + " volt.");

        /*
        11. Volt nagyon meleg nap?
        Volt olyan nap, amikor a hőmérséklet legalább 40 fok volt?
        Ne keressünk tovább, ha tudjuk a választ.
        Írjuk ki a választ.
        break; !!!
         */

        nap = 0;
        int meleg = 0;
        for (int i = 0; i < homersekletek.length; i++) {
            if (homersekletek[i] >= 40) {
                meleg = homersekletek[i];
                nap = i;
                break;
            }
        }

        System.out.println("A(z) " + nap + ". napon már " + meleg + " volt.");


    }
}
