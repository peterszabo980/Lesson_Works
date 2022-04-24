package hu.progmatic.Basic_20220319;

public class Ora20220319_ElsoN {
    public static void main(String[] args) {
        int darab = 5;

        int sum = 0;
         /*
        //írjuk ki az első dbarab szám összegét
        for (int i = 0; i <= darab ; i++) {
            sum += i;
        }
        System.out.println(sum);
         */

        // i = add = 1, 2, 3, 4, 5
        for (int i = 1; i <= darab; i++) {
            sum += i;
        }
        System.out.println("A: " + sum);

        // i = add - 1 = 0, 1, 2, 3, 4, 5 -> 1, 2, 3, 4, 5
        int sum2 = 0;
        for (int i = 0; i < darab; i++) {
            sum2 += (i + 1);
        }
        System.out.println("B: " + sum2);

        int osszeg = elsoN(darab);
        System.out.println("C: " + osszeg);
        System.out.println("D: " + elsoN(5));
    }

    public static int elsoN(int darab) {
        int sum = 0;
        //írjuk ki az első dbarab szám összegét
        for (int i = 1; i <= darab ; i++) {
            sum += i;
        } return sum;
    }

}
