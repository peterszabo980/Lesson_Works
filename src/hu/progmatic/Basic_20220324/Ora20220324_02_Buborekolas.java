package hu.progmatic.Basic_20220324;

public class Ora20220324_02_Buborekolas {
    public static void main(String[] args) {
        int [] homersekletek = {
                5, 2, 1, 0, 15, -8,
                -4, -4, -8, 3, -5, 2
        };

        for (int i = 0; i < homersekletek.length - 1; i++) {
            buborekol(homersekletek, i);
        }
        System.out.println("Sikerült!");
    }

    // korokSzama -> rendezett tömb hossza
    // rendezetlen tömb hossza = tömb hossza - rendezett tömb hossza
    // HELYBEN RENDEZ - referenciát kapunk és felül írjuk
    public static void buborekol(int[] homersekletek, int korokSzama) {
        for (int i = 0; i < homersekletek.length - korokSzama - 1; i++) {
            if (homersekletek[i] > homersekletek[i + 1]) {
                int csere = homersekletek[i];
                homersekletek[i] = homersekletek[i + 1];
                homersekletek[i + 1] = csere;
            }
        }
    }
}
