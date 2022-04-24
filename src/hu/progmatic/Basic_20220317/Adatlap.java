package hu.progmatic.Basic_20220317;

public class Adatlap {
    public static void main(String[] args) {
        String firstName = "Péter";
        String lastName = "Szabó";
        String city = "Budapest XIV";

        //form("Pét" + "er", "Szabó", "Buda" + "pest");
        form(firstName, lastName, city);

        firstName = "Béla";
        lastName = "Kiss";
        city = "Pécs";

        form(firstName, lastName, city);

        System.out.println("Tök jó!");
    }

    public static void form(String firstName, String lastName, String city) {
        //city += " III.";
        System.out.println("============================");
        System.out.println("\t\tAdatlap:");
        System.out.println("============================");

        System.out.println("Vezetéknév: " + firstName);
        System.out.println("Keresztnév: " + lastName);
        System.out.println("Város:\t\t" + city);



    }


}
