package hu.progmatic.LW_20220310;

import java.util.Scanner;

public class LW_20220310_Osszeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Az első hány darab szám összegét adjam meg? ");
        int darab = scanner.nextInt();
        scanner.nextLine();
        int osszeg = 0;
        int parosOsszeg = 0;

        for (int i = 0; i < darab; i++) {
            osszeg += (i + 1);
            parosOsszeg += 2 * i;
        }

        /*
        osszeg += (0 + 1);
        parosOsszeg += 2 * 0;

        osszeg += (1 + 1);
        parosOsszeg += 2 * 1;

        osszeg += (2 + 1);
        parosOsszeg += 2 * 2;
         */
        System.out.println("A számok összege: " + osszeg);
        System.out.println("A páros számok összege: " + parosOsszeg);
    }
}
