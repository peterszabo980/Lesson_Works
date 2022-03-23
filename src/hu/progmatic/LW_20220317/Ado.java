package hu.progmatic.LW_20220317;

public class Ado {
    public static void main(String[] args) {
        calculateTax(1_000_000, 100_000, 200_000);
        calculateTax(600_000, 100_000, 150_000);
        calculateNet(1_000_000);
        calculateNet(600_000);
    }

    public static void calculateTax(int gross, int tax, int contribution) {
        int net = gross - tax - contribution;
        System.out.println("Bruttó bér:\t" + gross);
        System.out.println("Nettó bér:\t" + net);
        System.out.println("------------------------");

    }

    public static void calculateNet(int gross) {
        int net = (gross * 665) / 1000;
        System.out.println("Bruttó bér:\t" + gross);
        System.out.println("Nettó bér:\t" + net);
        System.out.println("------------------------");
    }

}
