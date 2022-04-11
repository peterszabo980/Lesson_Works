package hu.progmatic.LW_20220319;

import java.util.Scanner;

public class Ora20220319_Penztarolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //6. feladat
        /*
        System.out.println("Gömb? (i/n)");
        boolean isSphere = sc.nextLine().equalsIgnoreCase("i");
        System.out.println("Kérem a méretet: ");
        double size = sc.nextDouble();
        sc.nextLine();
        double capacity1 = moneyBinCapacity(isSphere, size);

        System.out.println("Gömb? (i/n)");
        isSphere = sc.nextLine().equalsIgnoreCase("i");
        System.out.println("Kérem a méretet: ");
        size = sc.nextDouble();
        sc.nextLine();
        double capacity2 = moneyBinCapacity(isSphere, size);

        double capacity = capacity1 + capacity2;
        System.out.println("A teljes kapacitás: " + capacity);
        */

        System.out.println("Mennyi pénzt szeretnél tárolni?");
        double total = sc.nextDouble();
        sc.nextLine();

        while (total > 0) {
            System.out.println("Gömb? (i/n)");
            boolean isSphere = sc.nextLine().equalsIgnoreCase("i");
            System.out.println("Kérem a méretet: ");
            double size = sc.nextDouble();
            sc.nextLine();
            double capacity = moneyBinCapacity(isSphere, size);
            total -= capacity;

            System.out.println("Az új pénztároló kapacitása: " + capacity);
            System.out.println("Maradék pénz: " + total);

        }
    }
    //6. feladat
    public static double moneyBinCapacity(boolean isSphere, double size) {
        if (isSphere) {
            return (4.0 / 3) * Math.PI * size * size * size;
        } else {
            return size * size * size;
        }
    }


}
