package LW_20220310;

import java.util.Scanner;

public class LW_20220310_0_1_2_3_Kirandulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        0. Hőmérsékletek kiírása.
        Hozzunk létre egy 10 tört számot (double) tartalmazó tömböt.
        Állítsunk be megfelelő kezdő értékeket (pl. array initializer segítségével).
        */

        /* int meret = 3;
        double[] homersekletek = new double[meret + 1]; */
        // double[] homersekletek = new double[10];
        // homersekletek[0] = 23.0;
        //double[] homersekletek = new double[] {10.0, 12.0};
        double[] homersekletek = {3.2, -2.1, 5.0, 2.1, -1.7, 12.2, 10.0, 25.6, 11.0, -3.5};

        /*
        1. Kirándulás
        Egy kirándulás több napig tart.
        Kérjük be a kezdőnapot (1 és 10 nap között) és a kirándulás hosszát napokban (1 napos kirándulás az adott napon ér véget).
        Írjuk ki a kirándulás elején mért hőmérsékletet, a kirándulás végén mért hőmérsékletet,
        a hőmérséklet változását és 1 napnál hosszabb kirándulás esetén a hőmérséklet átlagos naponkénti változását.

        Bónusz: Ellenőrizzük az értékek helyességét beolvasásnál. - NINCS KÉSZ
         */
        /*
        System.out.print("Kérem az első kirándulási napot: ");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kérem a kirándulási napok hosszát: ");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsohomerseklet = homersekletek[(elso) - 1]; // azért elso-1, mert a tömbök 0-val kezdikaz indexálást
        double utolsohomerseklet = homersekletek[elso - 1 + (hossz- 1)];
        double valtozas = utolsohomerseklet - elsohomerseklet;

         */
        /*
        System.out.println("Az első napi hőmérséklet: " + elsohomerseklet);
        System.out.println("Az utolsó napi hőmérséklet: " + utolsohomerseklet);
        System.out.println("A hőmérséklet változás a kirándulás során: " + valtozas);

        if (hossz > 1) {
            System.out.print("A hőmérséklet átlagos változása: " + valtozas / (hossz - 1));
        }
        */
        /*
        2. Az első három hőmérsékletet kérjük be a felhasználótól.
        Írjuk ki a kirándulás adatait az előző feladathoz hasonlóan.
        */
        System.out.println();
        /*
        System.out.print("Kérem az első nap hőmérsékletét: ");
        homersekletek[0] = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Kérem a második nap hőmérsékletét: ");
        homersekletek[1] = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Kérem a második nap hőmérsékletét: ");
        homersekletek[2] = scanner.nextDouble();
        scanner.nextLine();
        */
        /*
        int i = 0;
        System.out.print("Kérem a(z) " + i + 1 + ". nap hőmérsékletét: ");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Kérem a(z) " + i + 1 + ". nap hőmérsékletét: ");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Kérem a(z) " + i + 1 + ". nap hőmérsékletét: ");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Kérem az első kirándulási napot: ");
        elso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kérem a kirándulási napok hosszát: ");
        hossz = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Az első napi hőmérséklet: " + elsohomerseklet);
        System.out.println("Az utolsó napi hőmérséklet: " + utolsohomerseklet);
        System.out.println("A hőmérséklet változás a kirándulás során: " + valtozas);

        if (hossz > 1) {
            System.out.print("A hőmérséklet átlagos változása: " + valtozas / (hossz - 1));
        }
        */
        /*
        3. Az első három hőmérsékletet kérjük be a felhasználótól for-ciklussal.
        Írjuk ki a kirándulás adatait az előző feladathoz hasonlóan.

        Bónusz: Kérjük be az összes elemet for-ciklussal.
        */
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("Kérem a(z) " + (i + 1) + ". nap hőmérsékletét: ");
            homersekletek[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.print("Kérem az első kirándulási napot: ");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kérem a kirándulási napok hosszát: ");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsohomerseklet = homersekletek[(elso) - 1]; // azért elso-1, mert a tömbök 0-val kezdikaz indexálást
        double utolsohomerseklet = homersekletek[elso - 1 + (hossz- 1)];
        double valtozas = utolsohomerseklet - elsohomerseklet;

        System.out.println("Az első napi hőmérséklet: " + elsohomerseklet);
        System.out.println("Az utolsó napi hőmérséklet: " + utolsohomerseklet);
        System.out.println("A hőmérséklet változás a kirándulás során: " + valtozas);

        if (hossz > 1) {
            System.out.print("A hőmérséklet átlagos változása: " + valtozas / (hossz - 1));
        }

    }
}
