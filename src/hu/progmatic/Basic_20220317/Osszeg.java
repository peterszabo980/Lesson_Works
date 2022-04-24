package hu.progmatic.Basic_20220317;

public class Osszeg {
    public static void main(String[] args) {
        //int num1 = 100;
        //int num2 = 25;
        //System.out.println("1. szám: " + num1);
        //System.out.println("2. szám: " + num2);
        //System.out.println("Összeg: " + (num1 + num2));
        int num3 = 5;
        //sum(num1, num2);

        sum(100, 20, num3);
        sum(15, 13, num3);
        sum(21, 43, num3);

        sumZero();
        sumZero();
        sumZero();
    }

    public static void sumZero() {
        System.out.println("Összeg: 0");
    }

    public static void sum(int num1, int num2, int num4) {
        System.out.println("1. szám: " + num1);
        System.out.println("2. szám: " + num2);
        System.out.println("4. szám (ez valójában a 3. szám): " + num4);
        System.out.println("Összeg: " + (num1 + num2 + num4));
    }
}
