package hu.progmatic.LW_20220319;

public class Ora20220319_TombOsszeg {
    public static void main(String[] args) {
        int[] szamok ={1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 1; i <= szamok.length ; i++) {
            sum += szamok[i];
        }
        System.out.println(sum);
        System.out.println(elsoN(szamok));
    }

    public static int elsoN(int[] darab) {
        int sum = 0;
        //írjuk ki az első dbarab szám összegét
        for (int i = 1; i <= darab.length ; i++) {
            sum += darab[i];
        } return sum;
    }

}
