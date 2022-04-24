package hu.progmatic.Basic_20220321;

public class Ora20220321_01 {
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
        int Budapest3 = homersekletek[0][2];
        int Debrecen3 = homersekletek[1][2];
        int Sopron3 = homersekletek[2][2];
        System.out.println("Budapest hőmérséklete 3.-án: " + Budapest3);
        System.out.println("Debrecen hőmérséklete 3.-án: " + Debrecen3);
        System.out.println("Sopron hőmérséklete 3.-án: " + Sopron3);
        System.out.println("Budapest hőmérséklete 4.-én: " + homersekletek[0][3]);
        System.out.println("Debrecen hőmérséklete 4.-án: " + homersekletek[1][3]);
        System.out.println("Sopron hőmérséklete 4.-án: " + homersekletek[2][3]);
    }
}
