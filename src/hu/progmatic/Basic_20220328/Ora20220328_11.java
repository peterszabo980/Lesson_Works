package hu.progmatic.Basic_20220328;

//Összegzés (Feltétel nélküli)
public class Ora20220328_11 {
    public static void main(String[] args) {
        int[] homersekletek = { // Debrecen
                5, 2, 1, 0, 15, -8, -7, // 1-7
                -4, -4, -8, -8, 3, -5, -2 // 8-14
        };

        int osszeg = 0;

        for (int homerseklet : homersekletek) {
            osszeg += homerseklet;
        }

        /*
        for (int i = 0; i < homersekletek.length; i++) {
            osszeg += homersekletek[i];
        }
        */

        // formázott 2 tizedesre
        double atlag = (double) osszeg / homersekletek.length;
        System.out.println("Átlag: " + atlag);
        System.out.printf("Átlag: %.2f\n", atlag); // a \n = sortörés
        System.out.printf("Átlag: %10.2f", atlag);
    }
}
