package hu.progmatic.Basic_20220328;

//Feltételes összegzés
public class Ora20220328_12 {
    public static void main(String[] args) {
        int[] homersekletek = { // Debrecen
                5, 2, 1, 0, 15, -8, -7, // 1-7
                -4, -4, -8, -8, 3, -5, -2 // 8-14
        };

        //Páros napok átlaga

        int osszeg = 0;
        int szamlalo = 0;
        for (int i = 0; i < homersekletek.length; i++) {
            if (i % 2 != 0) {
                continue; // rossz eset átugrása
            }
            osszeg += homersekletek[i];
            szamlalo++;
        }


        double atlag = (double) osszeg / szamlalo;

        System.out.printf("Átlag: %.2f\n", atlag); // a \n = sortörés



    }
}
