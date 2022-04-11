package hu.progmatic.LW_20220319;

import java.util.Scanner;

public class Ora20220319Erdo {
    public static void main(String[] args) {
        //3. feladat: double area = Math.PI * 2.5 * 2.5;
        //3. feladat - bővített: double area = Math.PI * 2.5 * 2.5 + Math.PI * 5.0 * 5.0;

        //3. feladat hagyományos megoldás
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első sugarat: ");
        double r1 = sc.nextDouble();
        System.out.println("Kérem a második sugarat: ");
        int r2 = sc.nextInt();

        double area = circleArea(r1) + circleArea(r2);
        System.out.println("A teljes terület: " + area);
    }

    public static double circleArea(double r) {
        return Math.PI * r * r;
    }
}
