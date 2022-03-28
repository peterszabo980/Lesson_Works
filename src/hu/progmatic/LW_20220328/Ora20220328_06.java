package hu.progmatic.LW_20220328;

public class Ora20220328_06 {
    public static void main(String[] args) {
        int[] homersekletek = { // Debrecen
                5, 2, 1, 0, 15, -8, -7, // 1-7
                -4, -4, -8, -8, 3, -5, -2 // 8-14
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

        //Feladat: Melyik volt az első olyan nap, amikor a hőmérséklet legalább 10 fok volt?

        // érvénytelen érték beállítása (érdemes használni)
        String elsoDatum = null;
        for (int i = 0; i < homersekletek.length; i++) {
            if (homersekletek[i] >= 10) {
                // ha van találat, akkor átírjuk érvényesre az elsoDatum-ot
                elsoDatum = datumok[i];
                break;
            }
        }
        if (elsoDatum != null)  {
            System.out.println("Az első találat: " + elsoDatum);
        } else {
            System.out.println("Nem volt találat!");
        }
    }
}
