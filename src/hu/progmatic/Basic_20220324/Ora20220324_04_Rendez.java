package hu.progmatic.Basic_20220324;

public class Ora20220324_04_Rendez {
    public static void main(String[] args) {
        int[] homersekletek = {
                5, 2, 1, 0, 15, -8,
                -4, -4, -8, 3, -5, 2
        };

        int[] rendezettHomersekletek = rendez(homersekletek);

        System.out.println("Sikerült!") ;
    }

    public static int[] rendez(int[] homersekletek) {
        int[] masolat = homersekletek.clone(); // elemenként lemásolja a tömböt
        for (int i = 0; i < masolat.length; i++) {
            for (int j = 0; j < masolat.length - i - 1; j++) {
                if (masolat[j] > masolat[j + 1]) {
                    int csere = masolat[j];
                    masolat[j] = masolat[j + 1];
                    masolat[j + 1] = csere;
                }
            }
        }
            return masolat;
    }
}
