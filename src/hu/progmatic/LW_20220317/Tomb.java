package hu.progmatic.LW_20220317;

public class Tomb {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {2, 4, 6, 8, 10, 11};
        int sum1 = sumArray(numbers1);
        int sum2 = sumArray(numbers2);
        int sum3 = sumArray(new int[] {1, 2, 3});
        int sumZero = sumArray(new int[0]);

        System.out.println("1. összeg: " + sum1); //= System.out.println("1. összeg: " + sumArray(numbers1));
        System.out.println("2. összeg: " + sum2);
        System.out.println("3. összeg: " + sum3);
        System.out.println("4. összeg: " + sumZero);

    }

    public static int sumArray(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

}
