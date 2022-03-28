package hu.progmatic.LW_20220328;
// MInimum keresés - 2. verzió (feltételes)
public class Ora20220328_08 {
    public static void main(String[] args) {
        int[] homersekletek = { // Debrecen
                5, 2, 1, 0, 15, -8, -7, // 1-7
                -4, -4, -8, -8, 3, -5, -2 // 8-14
        };

        int min = Integer.MAX_VALUE;

        for (int homerseklet : homersekletek) {

            if (homerseklet < min && homerseklet > 0 ) {
                min = homerseklet;
            }
        }
        System.out.println("A legkisebb hőmérséklet: " + min);
    }
}
