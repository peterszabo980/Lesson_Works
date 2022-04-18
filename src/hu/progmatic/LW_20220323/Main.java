package hu.progmatic.LW_20220323;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 1, -4, 3};
    }
    //a metódus feje = a metódus szignatúrája

    public static void change(int[] numbers) {
        if (numbers.length > 1) {
            if (numbers[0] > numbers[1]) {
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
            }
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            sum += j;
        }
        return sum;

        /* FOREACH
        for (int elem : array) {
            sum += elem;
        }
        return sum;
         */
    }

    public static int sumArrayDuble(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int[] array = matrix[i];
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;

    }
}
