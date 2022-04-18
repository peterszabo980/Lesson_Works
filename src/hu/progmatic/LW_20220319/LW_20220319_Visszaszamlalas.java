package hu.progmatic.LW_20220319;

public class LW_20220319_Visszaszamlalas {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = countDown(10);
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(i);
            Thread.sleep(700); // hogy ez működjön, kell hozzá a throws InterruptedException
            System.out.print("\b\b\b\b");
        }
    }

    public static int[] countDown(int from) {
        int[] numbers = new int[from + 1];
        for (int i = from; i >= 0 ; i--) {
            numbers[from - i] = i;
        }
        return numbers;
    }

}
