package hu.progmatic.LW_20220328;

public class Ora20220328_03 {
    public static void main(String[] args) {
        int[] homersekletek = { // Debrecen
                5, 2, 1, 0, 15, -8, -7, // 1-7
                -4, -4, -8, -8, 3, -5, -2 // 8-14
        };

        System.out.println(voltEHidegebb(homersekletek, -7)); // true
        System.out.println(voltEHidegebb(homersekletek, -20)); //false
        System.out.println(voltEMelegebb(homersekletek, -20)); //true
        System.out.println(voltEMelegebb(homersekletek, 20)); //false


    }

    public static boolean voltEHidegebb(int[] homersekletek, int referencia) {
        boolean voltE = false;
        for (int homerseklet : homersekletek) {
            if (homerseklet < referencia) {
                voltE = true;
                break;
            }
        }
        return voltE;
    }

    public static boolean voltEMelegebb(int[] homersekletek, int referencia) {
        boolean voltE = false;
        for (int homerseklet : homersekletek) {
            if (homerseklet > referencia) {
                voltE = true;
                break;
            }
        }
        return voltE;
    }


}
