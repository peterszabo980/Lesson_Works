package hu.progmatic.Basic_20220331;

import java.util.Arrays;

public class Ora20220331_02 {
    public static void main(String[] args) {
        String[] csv = {
                "Budapest;  2022.01.01; -9",
                "Győr;      2022.01.01;  0",
                "Sopron;    2022.01.01; -2",
                "Győr;      2022.01.02; -8",
                "Sopron;    2022.01.02; -7",
                "Budapest;  2022.01.03; -2",
                "Győr;      2022.01.03; -5",
                "Sopron;    2022.01.03; -4",
                "Budapest;  2022.01.04; 19",
                "Győr;      2022.01.04; 10",
                "Sopron;    2022.01.04; 8",
                "Budapest;  2022.01.05; 9",
                "Győr;      2022.01.05; 5",
                "Sopron;    2022.01.05; 5"
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

        System.out.println("Városok: " + Arrays.toString(cities));
        System.out.println("Dátumok: " + Arrays.toString(dates));
        System.out.println("Hőmérsékleek: " + Arrays.toString(temperatures));

        // 2. feladat: értékek kiírása for-ciklussal
        System.out.println("---------------------");
        System.out.println("For ciklussal a tömb elemeinek kiírása");
        for (int i = 0; i < csv.length; i++) {
            String info = (cities[i].substring(0, 3).toUpperCase() + " "
                    + dates[i].substring(5) + " "
                    + temperatures[i] + " fok");

            System.out.println(info);
        }
    }
}
