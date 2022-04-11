package hu.progmatic.LW_20220319;

public class gyak {
    public static void main(String[] args) {
        int[][] homersekletek = {
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

        int[] sopronHomersekletek = homersekletek[2];
        int sopron7 = sopronHomersekletek[6];
        System.out.println("Sopron 7. - " + sopron7);
    }



}

