package hu.progmatic.Basic_20220307;

import java.util.Scanner;

public class LW_20220307 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        1. Összefűzés (hossz alapján)
        Kérjünk be egy hossz nevű változót.
        A változó bekérése után kérjünk be szövegeket és fűzzük a szövegeket egy eredményt tároló változóhoz.
        (Pl. "a" + "lm" + "a" -> "alma")
        Addig ismételjük meg a folyamatot, amíg az összefűzött szöveg hossza ("alma".length()) nem éri el a hosszban tárolt értéket.
        Írjuk ki az összefűzött szöveget.

        System.out.println("Milyen hosszú lesz a szó?");
        int hossz = scanner.nextInt();
        scanner.nextLine();
        String szoveg = "";

        while (szoveg.length() < hossz) {
            System.out.println("Kérlek, mond a betűt: ");
            String db = scanner.nextLine();
            szoveg += db;
        }

        System.out.println(szoveg);
        */

        /*
        2. Összefűzés (vége karakter)
        Írjunk programot, amelyik szövegeket kér be a felhasználótól.
        A szövegeket fűzzük hozzá egy eredményt tároló változóhoz.
        Addig ismételjük meg a folyamatot, amíg a felhasználó nem egy üres szöveget ad meg.
        Írjuk ki az összefűzött szöveget.


        String szoveg = "";
        String darab;

        do {
            System.out.println("Kérem a következő darabot: ");
            darab = scanner.nextLine();
            szoveg += darab;
        } while (darab.length() > 0); // ugyan az, mint a !darab.equals(");
        System.out.println("A megadott szöveg: " + szoveg);
        */

        /*
        3. Árfolyam (stop-loss)
        Kérjünk be egy stop-loss (ha az árfolyam eléri vagy kisebb ennél, akkor eladjuk a részvényt), valamint egy induló árfolyamot.
        Addig kérjük be a napi változásokat, amíg az árfolyam nem csökken (éri el) a megadott stop-loss érték alá.
        Írjuk ki az eltelt napok számát és az utolsó árfolyamot.


        System.out.println("Add meg a stop-loss árfolyamot: ");
        int stop = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg az induló árfolyamot: ");
        int indulo = scanner.nextInt();
        scanner.nextLine();
        int nap = 0;

        while (indulo > stop) {
            System.out.println("Kérem a napi változást: ");
            int napi = scanner.nextInt();
            indulo += napi;
            nap ++;
        }
        System.out.println("Az utolsó árfolyam: " + indulo);
        System.out.println("Az eltelt napok száma: " + nap);
        */

        /*
        4. Árfolyam (take-profit)
        Kérjünk be egy take-profit (ha az árfolyam eléri vagy nagyobb ennél, akkor eladjuk a részvényt), valamint egy induló árfolyamot.
        Addig kérjük be a napi változásokat, amíg az árfolyam nem haladja meg (éri el) a megadott take-profit értéket.
        Írjuk ki az eltelt napok számát és az utolsó árfolyamot.

        System.out.println("Add meg a take-profit árfolyamot: ");
        int profit = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg az induló árfolyamot: ");
        int indulo = scanner.nextInt();
        scanner.nextLine();
        int nap = 0;

        while (indulo < profit) {
            System.out.println("Kérem a napi változást: ");
            int napi = scanner.nextInt();
            indulo += napi;
            nap ++;
        }
        System.out.println("Az utolsó árfolyam: " + indulo);
        System.out.println("Az eltelt napok száma: " + nap);
        */

        /*
        5. Árfolyam (első emelkedés)
        Kérjük be az induló árfolyamot.
        Addig kérjük be a változásokat, amíg nem volt emelkedés.
        Írjuk ki az eltelt napok számát és az utolsó árfolyamot.

        System.out.println("Kérem az induló árfolyamot: ");
        int indulo = scanner.nextInt();
        scanner.nextLine();
        int nap = 0;
        int valtozas = 0;
        do {
            System.out.println("Kérem a változást: ");
            valtozas = scanner.nextInt();
            scanner.nextLine();
            indulo += valtozas;
            nap ++;
        } while (valtozas <= 0);

        System.out.println("Az utolsó árfolyam: " + indulo);
        System.out.println("Az eltelt napok száma: " + nap);
        */

        /*
        6. Árfolyam (első esés)
        Kérjük be az induló árfolyamot.
        Addig kérjük be a változásokat, amíg nem volt esés.
        Írjuk ki az eltelt napok számát és az utolsó árfolyamot.

        System.out.println("Kérem az induló árfolyamot: ");
        int indulo = scanner.nextInt();
        scanner.nextLine();
        int nap = 0;
        int valtozas = 0;
        do {
            System.out.println("Kérem a változást: ");
            valtozas = scanner.nextInt();
            scanner.nextLine();
            indulo += valtozas;
            nap ++;
        } while (valtozas >= 0);

        System.out.println("Az utolsó árfolyam: " + indulo);
        System.out.println("Az eltelt napok száma: " + nap);
        */

        /*
        7. Jelszó
        Kérjünk be egy legalább 8 karakter hosszú jelszót.
        Ha a felhasználó érvénytelen jelszót adott meg, akkor írjunk ki egy hibaüzenetet, majd ismételjük meg a beolvasást.
        Írjuk ki a beolvasott érvényes jelszót.

        String jelszo = "";
        do {
            System.out.print("Kérek, egy legalább 8 karakter hosszú jelszót: ");
            jelszo = scanner.nextLine();
            if (jelszo.length() < 8) {
                System.out.println("A jelszó nem megfelelő.");
            }
        } while (jelszo.length() < 8);

        System.out.println("A megadott jelszó: " + jelszo);
        */

        /*
        8. Irányítószám
        Kérjünk be egy érvényes irányítószámot (1000 és 9999 közötti számot).
        Ha az irányítószám érvénytelen volt, akkor írjunk ki egy hibaüzenetet, majd ismételjük meg a beolvasást.
        Írjuk ki a beolvasott érvényes irányítószámot.

        int irsz;
        do {
            System.out.print("Kérlek, adj egy érvényes irányítószámot 1000 és 9999 között: ");
            irsz = scanner.nextInt();

            if (irsz < 1000 || irsz > 9999) {
                System.out.println("Kérlek, hogy az irányítószám 1000 és 9999 közötti szám legyen.");
            }
        } while (irsz < 1000 || irsz > 9999);
        System.out.println("Az irányítószám: " + irsz);
        */

        /*
        9. Abszolút érték
        Kérjünk be egy számot.
        Ternáris operátor segítségével határozzuk meg a szám abszolút értékét.
        Írjuk ki az abszolút értéket.

        System.out.println("Adj meg egy számot: ");
        int szam = scanner.nextInt();
        int a = szam < 0 ? szam = -szam : szam;
        System.out.println(a);
        */

        /*
        10. Különbség
        Kérjünk be kettő számot.
        Ternáris operátor segítségével határozzuk meg a két szám különbségét (különbségének az abszolút értékét).
        Írjuk ki a különbséget.

        System.out.println("Kérem az elso számot: ");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem, a második számot: ");
        int masodik = scanner.nextInt();
        scanner.nextLine();
        int c = elso - masodik;
        int kulonbseg = c < 0 ? c = - c : c;
        System.out.println("A különbség: " + kulonbseg);
        */

        /*
        11. Megszólítás
        Kérjük be egy ember nevét.
        Kérjük be egy logikai változóba és mentsük el az ember nemét.
        Ternáris operátorral határozzunk meg egy alkalmas megszólítást
        ("Tisztelt Kovács József Úr!", "Tisztelt Nagy Anna Asszony!") és mentsük el egy változóba.
        Írjuk ki a megszólítást.

        System.out.println("Kérem, adja meg a nevét: ");
        String nev = scanner.nextLine();
        System.out.println("Ön nő? (i / n)");
        boolean no = !scanner.nextLine().equals("n");
        String a = " Asszony!";
        String b = " Úr!";
        String megszolit = no == true ? a :b;
        System.out.println("Tisztelt " + nev + megszolit);
        */

        /*
        12. Paranccsor

        Írjunk egy egyszerűsített parancssort megvalósító programot.
        A program kérjen be mindig egy parancsot a felhasználótól.
        A három érvényes parancs:
        - köszönés (írjuk ki a "Sziasztok!" köszönést)
        - vége (lépjünk ki a programból)
        - súgó (írjuk ki az érvényes parancsok listáját)
        */
        String parancs;

        do {
            System.out.println("Kérlek, add meg a parancsot: (köszönés / vége / súgó)");
            parancs = scanner.nextLine();

            if (parancs.equals("köszönés")) {
                System.out.println("Sziasztok!");
            } else if (parancs.equals("súgó")) {
                System.out.println("Az érvényes parancsok listája: köszönés / súgó / vége");
            } else if (parancs.equals("vége")) {
                System.out.println("Vége!");
                break;
            }
        } while (!parancs.equals("köszönés") || !parancs.equals("súgó") || !parancs.equals("vége"));


    }
}

