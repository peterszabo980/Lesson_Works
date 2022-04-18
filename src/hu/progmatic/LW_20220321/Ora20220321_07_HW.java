package hu.progmatic.LW_20220321;

import java.util.Scanner;

public class Ora20220321_07_HW {
    public static void main(String[] args) {
        // A 07-es feladat alapján készítsük el metódusban.
        // Kérjük be, hogy mely város hőmérsékletét szeretnénk megvizsgálni.
        // Kérjük be, hogy milyen értéknél nagyobbat vagy kisebbet szeretnénk megvizsgálni.
        int[][] homersekletek =  {
                { // Budapest
                        2, 4, 4, 0, -5, -5, -7, // 1-7
                        -4, -3, -8, -8, -2, -3, 6 // 8-14
                },
                { // Debrecen
                        5, 2, 1, 0, 5, -8, -7, // 1-7
                        -4, -4, -8, -8, 3, -5, -2 // 8-14
                },
                { // Sopron
                        2, 3, 3, 3, 2, 0, -3, // 1-7
                        -4, -9, 8, 8, 2, -3, 5 // 8-14
                }
        };
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a város indexét! (0-2)");
        int varosIndex = sc.nextInt();
        sc.nextLine();

        System.out.println("Hány foknál vizsgáljuk meg, hogy volt-e melegebb a " + varosIndex + ". indexű városban? Add meg a referenciahőmérsékletet. ");
        int referenciaHomerseklet = sc.nextInt();
        sc.nextLine();


        if (voltEMelegebbVarosban(homersekletek[varosIndex], referenciaHomerseklet)) {
            System.out.println("Volt melegebb a " + varosIndex + ". indexű városban.");
        } else {
            System.out.println("Nem volt melegebb a " + varosIndex + ". lekét indexű városban.");
        }
        //System.out.println(voltEMelegebbVarosban(homersekletek[varosIndex], referenciaHomerseklet));


    }

    public static boolean voltEMelegebbVarosban(int[] varosIndex, int referenciaHomerseklet) {

        boolean voltEMelegebb = false;

        int[] varosHomersekletek = varosIndex;

        for (int i = 0; i < varosHomersekletek.length ; i++) {
            if (varosHomersekletek[i] > referenciaHomerseklet) {
                voltEMelegebb = true;
                break;
            }
        }
        return voltEMelegebb;
    }
}
