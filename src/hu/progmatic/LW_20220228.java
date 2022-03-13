package hu.progmatic;

import java.util.Scanner;

public class LW_20220228 {
    public static void main(String[] args) {

        /*
        String nev;
        nev = "Balázs";
        String koszones = "Szia " + nev + "!";

        System.out.println(koszones);
        */

        /*
        int szuletesiEv = 1980;
        int aktualisEv = 2022;
        int eletkor;
        eletkor = aktualisEv - szuletesiEv;

        System.out.println(eletkor - 1);
         */

        /*
        int a = 5;
        int b = 10;
        int terulet = a * b;

        System.out.println("A téglalap területe: " + terulet);
        */

        /*
        int torzstoke = 3000000;
        int toke = torzstoke;

        System.out.println("Tőrzstőke: " + torzstoke);
        System.out.println("Tőke a(z) 0. évben: " + toke);

        toke = toke + 2000000;
        System.out.println("Tőke a(z) 1. év: " + toke);

        toke = toke - 100000;
        System.out.println("Tőke a(z) 2. év: " + toke);

        toke = toke + 500000;
        System.out.println("Tőke a(z) 3. év: " + toke);
        */

        Scanner scanner = new Scanner(System.in);
        /*
       // String vezeteknev = "Szabó";
        System.out.println("Mi a vezetékneved? ");
        String vezeteknev = "Mr. " + scanner.nextLine();
       // String keresztnev = "Péter";
        System.out.println("Mi a keresztneved? ");
        String keresztnev = scanner.nextLine();
        String nev = vezeteknev + " " + keresztnev;

        System.out.println("Szia " + nev + "!");
        */


        System.out.println("Kérem a számot!");
        /*
        int szam = scanner.nextInt();
        int eredmeny = szam * szam;
        System.out.println("A szám négyzete: " + eredmeny);
        */

        int szam = scanner.nextInt();
        int eredmeny = szam;

        if (szam < 0) {
            eredmeny = eredmeny * -1;
        }

        System.out.println("A szám abszolut értéke: " + eredmeny);

    }
}
