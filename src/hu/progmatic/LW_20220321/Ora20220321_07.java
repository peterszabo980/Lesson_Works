package hu.progmatic.LW_20220321;

import java.util.Scanner;

public class Ora20220321_07 {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány foknál vizsgáljuk meg, hogy volt-e melegebb Sopron? Add meg. ");
        int referenciaHomerseklet = sc.nextInt();
        sc.nextLine();
        boolean voltEMelegebb = false;

        int[] sopronHomersekletek = homersekletek[2];

        for (int i = 0; i < sopronHomersekletek.length ; i++) {
            if (sopronHomersekletek[i] > referenciaHomerseklet) {
                voltEMelegebb = true;
                break;
            }
        }

        // voltEMelegebb == true
        if (voltEMelegebb) {
            System.out.println("Volt melegebb.");
        } else {
            System.out.println("Nem volt melegebb.");
        }


    }
}
