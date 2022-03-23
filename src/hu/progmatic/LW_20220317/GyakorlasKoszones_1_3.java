package hu.progmatic.LW_20220317;

import java.util.Scanner;

public class GyakorlasKoszones_1_3 {
    public static void main(String[] args) {
        koszon1();
       // koszon2("Nagy", "Anna", false);

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a vezetékneket!");
        String lastName = sc.nextLine();
        System.out.println("Kérem a keresztnevet!");
        String firstName = sc.nextLine();
        System.out.println("Kérem a nemet (f / n)");
        boolean isMale = sc.nextLine().equalsIgnoreCase("f");

        //koszon2(lastName, firstName, isMale);
        String koszones = koszon3(lastName, firstName, isMale);

        System.out.println(koszones);
        System.out.println();
        System.out.println("Örömmel értesítjük, hogy sikeresen megoldotta a feladatot!");

    }

    public static void koszon1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a vezetékneket!");
        String lastName = sc.nextLine();
        System.out.println("Kérem a keresztnevet!");
        String firstName = sc.nextLine();
        System.out.println("Kérem a nemet (f / n)");
        boolean isMale = sc.nextLine().equalsIgnoreCase("f");

        String greeting = "Tisztelt "
                + lastName
                + " "
                + firstName
                + " ";

        if (isMale) {
            greeting += "Úr";
        } else {
            greeting += "Hölgy";
        }
        System.out.println(greeting + "!");

    }

    public static void koszon2(String lastName, String firstName, boolean isMale) {
        String greeting = "Tisztelt "
                + lastName
                + " "
                + firstName
                + " ";

        if (isMale) {
            greeting += "Úr";
        } else {
            greeting += "Hölgy";
        }
        System.out.println(greeting + "!");
    }

    public static String koszon3(String lastName, String firstName, boolean isMale) {
        String greeting = "Tisztelt "
                + lastName
                + " "
                + firstName
                + " ";

        if (isMale) {
            greeting += "Úr!";
        } else {
            greeting += "Hölgy!";
        }
        return greeting;

    }

}
