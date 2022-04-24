package hu.progmatic.Basic_20220324;

public class Ora20220324_01 {
    public static void main(String[] args) {
        int [] homersekletek = {
                5, 2, 1, 0, 15, -8,
                -4, -4, -8, 3, -5, 2
        };

        // Arrays.sort(homersekletek);

        // "virtuális" programozási tétel: buborékolás :)
        // 2 verzió:
        // - legkisebb elemet a tömb elejére mozgatja VAGY
        // - legnagyobb elemet a tömb végére mozgatja
        for (int i = 0; i < homersekletek.length - 1; i++) {
            if (homersekletek[i] > homersekletek[i + 1]) {
                int csere = homersekletek[i];
                homersekletek[i] = homersekletek[i + 1];
                homersekletek[i + 1] = csere;
            }
        }
    }
}
