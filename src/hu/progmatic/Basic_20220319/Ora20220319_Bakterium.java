package hu.progmatic.Basic_20220319;

public class Ora20220319_Bakterium {
    public static void main(String[] args) {
        int currentNumber = 100;
        int requiredNumber = 1000;
        int doubleTime = 10;

        /*
        int counter = 0;
        // int time = 0;

        while (currentNumber < requiredNumber) {
            currentNumber *= 2;
            counter++;  // == time += doubleTime;
        }
        int time = counter * doubleTime;
        */

        int time = requiredTime(currentNumber, requiredNumber, doubleTime);
        System.out.println("Eltelt idő: " + time);
        time = requiredTime(1, 5000, 1);
        System.out.println("Eltelt idő: " + time);
    }

    public static int requiredTime(double current, double required, int doubleTime) {
        int counter = 0;
        // int time = 0;

        while (current < required) {
            current *= 2;
            counter++;  // == time += doubleTime;
        }
        int time = counter * doubleTime;

        return time;

    }

}
