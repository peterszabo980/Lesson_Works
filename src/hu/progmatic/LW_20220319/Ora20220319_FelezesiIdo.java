package hu.progmatic.LW_20220319;

public class Ora20220319_FelezesiIdo {
    public static void main(String[] args) {
         double currentRadiation = 500.0;
         double safeRadiation = 20.0;
         int counter = 0;

         while (currentRadiation > safeRadiation) {
            currentRadiation /=2;
            counter++;
         }
        System.out.println("Az eltelt felezési idő: " + counter);
    }
}
