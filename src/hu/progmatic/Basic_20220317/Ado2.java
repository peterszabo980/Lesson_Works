package hu.progmatic.Basic_20220317;

public class Ado2 {
    public static void main(String[] args) {
        int balance = 1_000_000;

        System.out.println("Egyenleg: " + balance);

        int grossIncome = 500_000;
        int spending = 400_000;

        balance += calculateNet(grossIncome) - spending;
        System.out.println("----------------------");

        System.out.println("Egyenleg: " + balance);

        grossIncome = 600_000;
        spending = 480_000;

        balance += calculateNet(grossIncome) - spending;

        System.out.println("----------------------");

        System.out.println("Egyenleg: " + balance);

        calculateNet(2_000_000);

    }

    public static int calculateNet(int gross) {
        int net = (gross * 665) / 1000;
        System.out.println("Nettó: " + net);
        return net;

        //return (gross * 665) / 1000;
    }
}
