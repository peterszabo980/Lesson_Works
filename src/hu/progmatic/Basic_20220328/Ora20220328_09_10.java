package hu.progmatic.Basic_20220328;

public class Ora20220328_09_10 {
    public static void main(String[] args) {

        int[] homersekletek = { // Debrecen
                5, 2, 1, 0, 15, -8, -7, // 1-7
                -4, -4, -8, -8, 3, -5, -2 // 8-14
        };
        //Feltétel nélküli
        int max = Integer.MIN_VALUE;
        for (int homerseklet : homersekletek) {
            if (homerseklet > max) {
                max = homerseklet;
            }
        }
        System.out.println("A legkisebb hőmérséklet: " + max);


        //Feltételes
        //Páratlan indexű napon a maximum hőmérséklet?
        //i % 2 == 1
        // homersekletek[1], homersekletek[3]...

        max = Integer.MIN_VALUE;

        for (int i = 0; i < homersekletek.length; i++) {
            if (i % 2 == 1 && homersekletek[i] > max) {
                max = homersekletek[i];
            }
        }
        System.out.println("A legnagyobb hőmérséklet páratlan indexű napon: " + max);

        // a continue a ciklus folyamatát átugorja, ha igaz a feltétel
        for (int i = 0; i < homersekletek.length; i++) {
        if (i % 2 != 1) {
            continue;
        }
            System.out.println("A legnagyobb hőmérséklet páratlan indexű napon: " + max);

        }

    }
}
