package hu.progmatic.Basic_20220331;

import java.util.Scanner;

public class Ora20220331_01 {
    public static void main(String[] args) {
        // raktárak kapacitása (m3)
        // xs   - 10
        // s    - 20
        // m    - 40
        // l    - 80
        // xl   - 160

        Scanner sc = new Scanner(System.in);

        // 1. feladat
        // - Kérjük be a felhasználótól a raktár méretét.
        // - Írjuk ki a rendelkezésre álló kapacitást.

        // 2. feladat
        // - Kérjük be a felhasználótól a raktár méretét.
        // - Kérjük be a raktárak számát.
        // - Írjuk ki a rendelkezésre álló összes kapacitást.

        // 3. feladat
        // - Kérjük be a felhasználótól 3 különböző raktár méretét.
        // - Írjuk ki a rendelkezésre álló összes kapacitást.

        // 4. feladat
        // - Hozzunk létre egy getStorageCapacity nevű függvényt.
        // - Kérjük be a felhasználótól 3 különböző raktár méretét.
        // - A függvény segítségével írjuk ki a rendelkezésre álló összes kapacitást.

        System.out.print("Kérem az első raktár méretét: ");
        String stroge1 = sc.nextLine().toLowerCase();
        System.out.print("Kérem a második raktár méretét: ");
        String stroge2 = sc.nextLine().toLowerCase();
        System.out.print("Kérem a harmadik raktár méretét: ");
        String stroge3 = sc.nextLine().toLowerCase();

        int capacity = getStorageCapacity(stroge1)
                     + getStorageCapacity(stroge2)
                     + getStorageCapacity(stroge3);

        System.out.println("A raktárak összes kapacitása: " + capacity);
    }

    public static int getStorageCapacity (String size) {
        switch (size) {
            case "xs":
                return 10;
            case "s":
                return 20;
            case "m":
                return 40;
            case "l":
                return 80;
            case "xl":
                return 160;
            default:
                return 0;
        }
    }


}
