package hu.progmatic.LW_20220310;

import java.util.Scanner;

public class LW_20220310_4_Jegtura {
    public static void main(String[] args) {
        /*
        4. Jégtúra
        Egy baráti társaság minden évben azokon a napokon megy kirándulni, amikor pontosan 0.0 fok a hőmérséklet.
        Kérjük be a felhasználótól a túra kezdőnapját (1 és 10 között) és hosszát napokban.
        Frissítsük az előrejelzést a túra napjaira (írjuk át a korábbi értékeket 0.0-ra).
        */
        Scanner scanner = new Scanner(System.in);
        double[] homersekletek = {3.2, -2.1, 5.0, 2.1, -1.7, 12.2, 10.0, 25.6, 11.0, -3.5};

        System.out.print("Kérem az első kirándulási napot: ");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kérem a kirándulási napok hosszát: ");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        for (int i = elso - 1; i < (elso) + (hossz - 1); i++) {
            homersekletek[i] = 0.0;
        }

        for (int i = 0; i < homersekletek.length; i++) {
            System.out.print(homersekletek[i] + " ");

        }


    }
}

