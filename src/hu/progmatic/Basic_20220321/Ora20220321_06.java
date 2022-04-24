package hu.progmatic.Basic_20220321;

public class Ora20220321_06 {
    public static void main(String[] args) {
        int[][] homersekletek =  {
                { // Budapest
                        2, 4, 4, 0, -5, -5, -7, // 1-7
                        -4, -3, -8, -8, -2, -3, 6 // 8-14
                },
                { // Debrecen
                        5, 2, 1, 0, 5, -8, -7, // 1-7
                        -4, -4, -8, -8, 3, -5, -2 // 8-14
                },
                { // Sopron
                        2, 3, 3, 3, 2, 0, -3, // 1-7
                        -4, -9, 8, 8, 2, -3, 5 // 8-14
                }
        };


        for (int i = 0; i < homersekletek.length; i++) {
            System.out.println(i + ". városban " + fagyosNapokSzáma(homersekletek[i]) + " fagyos nap volt.");
            }

        int osszesFagyosNapokSzáma = osszesFagyosNapokSzáma(homersekletek);
        System.out.println("Az összes fagyos nap száma: " + osszesFagyosNapokSzáma);

    }

    public static int osszesFagyosNapokSzáma(int[][] varosHomersekletek) {
        int osszesfagyosNapokSzama = 0;
        for (int i = 0; i < varosHomersekletek.length; i++) {
            for (int j = 0; j < varosHomersekletek[i].length; j++) {
                if (varosHomersekletek[i][j] < 0) {
                    osszesfagyosNapokSzama++;
                }
            }
        }
        return osszesfagyosNapokSzama;
    }

    public static int fagyosNapokSzáma(int[] varosHomersekletek) {
        int fagyosNapokSzama = 0;
        for (int i = 0; i < varosHomersekletek.length; i++) {
                if (varosHomersekletek[i] < 0) {
                    fagyosNapokSzama++;
                }
            }
        return fagyosNapokSzama;
    }

}
