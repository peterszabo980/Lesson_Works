package hu.progmatic.Basic_20220331;

public class Ora20220331_03 {
    public static void main(String[] args) {
        String[] csv = {
                "Budapest;2022.01.01;-9",
                "Győr;2022.01.01;0",
                "Sopron;2022.01.01;-2",
                "Győr;2022.01.02;-8",
                "Sopron;2022.01.02;-7",
                "Budapest;2022.01.03;-2",
                "Győr;2022.01.03;-5",
                "Sopron;2022.01.03;-4",
                "Budapest;2022.01.04;19",
                "Győr;2022.01.04;10",
                "Sopron;2022.01.04;8",
                "Budapest;2022.01.05;9",
                "Győr;2022.01.05;5",
                "Sopron;2022.01.05;5"
        };

        // 1. feladat: tömbök feltöltése CSV-ből

        String[] cities = new String[csv.length];
        String[] dates = new String[csv.length];
        int[] temperatures = new int[csv.length];

        for (int i = 0; i < csv.length; i++) {
            String[] values = csv[i].split(";");
            cities[i] = values[0].trim();
            dates[i] = values[1].trim();
            temperatures[i] = Integer.parseInt(values[2].trim());
        }

        /* RENDEZÉS ELEJE */
        for (int ready = 0; ready < temperatures.length - 1; ready++) {
            /* BUBORÉKOL ELEJE */
            // az utolsó elem kivételével minden elem bejárása (length - 1)
            // ténylegesen NEM a teljes tömböt,
            // hanem csak a rendezetlen részét kell az utolsó elem kivételével bejárni (length - ready - 1)

            /* OPTIMALIZÁCIÓ ELEJE */
            boolean sorted = true;
            /* OPTIMALIZÁCIÓ VÉGE */

            for (int i = 0; i < temperatures.length - ready - 1; i++) {
                // ha az éppen bejárt elem nagyobb a jobb oldali szomszédjánál,
                // akkor csere
                if (temperatures[i] > temperatures[i + 1]) {
                    /* CSERE ELEJE */
                    int xchg = temperatures[i];
                    temperatures[i] = temperatures[i + 1];
                    temperatures[i + 1] = xchg;
                    /* CSERE VÉGE */

                    /* OPTIMALIZÁCIÓ ELEJE */
                    sorted = false;
                    /* OPTIMALIZÁCIÓ VÉGE */
                }
            }
            /* BUBORÉKOL VÉGE */

            /* OPTIMALIZÁCIÓ ELEJE */
            if (sorted) {
                break;
            }
            /* OPTIMALIZÁCIÓ VÉGE */
        }
        /* RENDEZÉS VÉGE */
    }
}
