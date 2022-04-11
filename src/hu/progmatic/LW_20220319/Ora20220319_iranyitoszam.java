package hu.progmatic.LW_20220319;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class Ora20220319_iranyitoszam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 1. feladat */
        System.out.println("Kérem az irányítószámot: ");
        int irsz = sc.nextInt();
        sc.nextLine();
        System.out.println(irszVisszaVaros(irsz));
        /* 2. feladat */
        System.out.println("Add meg a város nevét: ");
        String nev = sc.nextLine();
        System.out.println(varosNeve(nev));

        int kulonbseg = varosNeve("Sopron") - varosNeve("Budapest");
        System.out.println("A különbség Sopron és Budapest irányítószámai között: " + kulonbseg);

    }

    public static String irszVisszaVaros (int irsz) {
        switch (irsz) {
            case 1000 :
                return "Budapest";
            case 4400 :
                return "Nyíregyháza";
            case 9400 :
                return "Sopron";
            case 9000 :
                return "Győr";
            default:
                return null;
        }
    }

    public static int varosNeve(String nev) {

        switch (nev.toUpperCase()) {
            case "BUDAPEST":
                return 1000;
            case "NYÍREGYHÁZA":
                return 4400;
            case "GYŐR":
                return 9000;
            case "SOPRON":
                return 9400;
            default:
                return 0;
        }
    }

    public static int postalCodaFromName(String name) {
        switch (name.toUpperCase()) {
            case "BUDAPESET":
                return 1000;
            case "NYÍREGHÁZA":
                return 4400;
            case "GYŐR":
                return 9000;
            case "SOPRON":
                return 9400;
            default:
                return 0;
        }
    }
}
