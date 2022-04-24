package hu.progmatic.Basic_20220324;

public class Ora20220324_05_Dupa_tomb_rendez {
    public static void main(String[] args) {
        int[] homersekletek = {
                5, 2, 1, 0, 15, -8,
                -4, -4, -8, 3, -5, 2
        };

        String[] datumok = {
                "2022.01.01.",
                "2022.01.02.",
                "2022.01.03.",
                "2022.01.04.",
                "2022.01.05.",
                "2022.01.06.",
                "2022.01.07.",
                "2022.01.08.",
                "2022.01.09.",
                "2022.01.10.",
                "2022.01.11.",
                "2022.01.12.",
                "2022.01.13.",
                "2022.01.14."
        };

        // hőmérséklet szerint növekvő sorrendben írjuk ki a napokat
        // 2022.01.06. (-8 fok)
        // 2022.01.10. (-8 fok)
        // 2022.01.11. (-8 fok)
        // 2022.01.07. (-7 fok)

        // 1. lépés: Csak a homersekletek tömböt rendezze.
        // 2. lépés: Bővítsük ki a csere részét az algoritmusnak. A dátum tömböt is rendezze.

        for (int i = 0; i < homersekletek.length; i++) {
            for (int j = 0; j < homersekletek.length - i - 1; j++) {
                if (homersekletek[j] > homersekletek[j + 1]) {
                    // hőmérséklet csere
                    int csere = homersekletek[j];
                    homersekletek[j] = homersekletek[j + 1];
                    homersekletek[j + 1] = csere;

                    // dátum csere
                    String datumCsere = datumok[j];
                    datumok[j] = datumok[j + 1];
                    datumok[j + 1] = datumCsere;
                }
            }
        }

        // rendezett tömbök kiíratása
        for (int i = 0; i < homersekletek.length; i++) {
            System.out.println(datumok[i] + " " + "(" + homersekletek[i] + ")");
        }
    }
}
