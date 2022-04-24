package hu.progmatic.Basic_20220324;

public class Ora20220324_03_Buborekolas {
    public static void main(String[] args) {
        int[] homersekletek = {
                5, 2, 1, 0, 15, -8,
                -4, -4, -8, 3, -5, 2
        };
        // i = korokSzama, rendezett tömb mérete
        // "idő", "verziók"
        for (int i = 0; i < homersekletek.length; i++) {
            for (int j = 0; j < homersekletek.length - i - 1; j++) {
                if (homersekletek[j] > homersekletek[j + 1]) {
                    int csere = homersekletek[j];
                    homersekletek[j] = homersekletek[j + 1];
                    homersekletek[j + 1] = csere;
                }
            }
        }
        System.out.println("Sikerület!");
    }
}
