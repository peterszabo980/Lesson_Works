package hu.progmatic.Basic_20220309;

import java.util.Scanner;

public class LW_20220309 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int db = 1;
        int sum = 0;
        while (db <= 5) {
            System.out.print("Kérem, a(z) " + db + " számot: ");
            int szam = 0;
            szam += szam;
            szam = scanner.nextInt();
            db ++;
            sum += szam;
        }

        System.out.println("A számok összege: " + sum);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        String numsToString = num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5;
        */
        /*
        int [] numbers = new int[5];
        int x = numbers[0];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        */
        /*
        int [] numbers = new int[]{3, 5, 12, 5, 7};
        // ugyan azt jelenti
                // int [] numbers = {3, 5, 12, 5, 7};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("A 4. elem értée ez volt: " + numbers[3]);
        numbers[3] = 11;
        System.out.println("A 4. elem értéke erre változott: " + numbers[3]);


        double [] doubles = new double[2];
        boolean [] booleans = new boolean[2];
        String [] strings = new String[2];

        System.out.println(doubles[0]);
        System.out.println(booleans[0]);
        System.out.println(strings[0]);
        */
/*
        System.out.println("Kélek, adj meg 5 számot egymás után enterrel: ");
        int [] tombs = new int[5];

        tombs[0] = scanner.nextInt();
        tombs[1] = scanner.nextInt();
        tombs[2] = scanner.nextInt();
        tombs[3] = scanner.nextInt();
        tombs[4] = scanner.nextInt();
        int sum = tombs[0]+tombs[1]+tombs[2]+tombs[3]+tombs[4];
        System.out.println("Az eredmény: " + sum);
 */
        /*
        char [] chars = new char[10];
        System.out.println(chars[10]);
    */

            /*
        int [] numbers2 = {1, 2, 3, 4, 5};

        int index = 0;
        while (index < 5 ) {

            System.out.println("A számok a tömbben: " + numbers2[index++]);
            //index ++; vagy index = index + 1; vagy index += 1;
        }
        */

        /*
       // System.out.println("Adj 5 számot egymás után enterrel: ");

        System.out.println("Kérlek add meg, hogy hány elemű tömb legyen: ");
        int db = scanner.nextInt();
        int index = 0;
        int [] numbers3 = new int [db];
        System.out.println("Adj " + numbers3.length + " számot egymás után enterrel: ");

        while (index < numbers3.length){
           numbers3[index] = scanner.nextInt();
           index++;
       }

        index = 0;
        while (index < numbers3.length) {
            System.out.println("A tömb számai: " + numbers3[index]);
            index++;
        }
         */
        /*
        System.out.println("Kérlek add meg, hogy hány elemű tömb legyen: ");
        int db = scanner.nextInt();
        int index = 0;
        int [] numbers3 = new int [db];
        System.out.println("Adj " + numbers3.length + " számot egymás után enterrel: ");

        while (index < numbers3.length){
            numbers3[index] = scanner.nextInt();
            index++;
        }

        System.out.println("Első: " + numbers3[0]);
        System.out.println("Utolsó: " + numbers3[numbers3.length - 1]);
    */
        int index = 0;
        String[] strings = {"első", "második", "harmadik", "negyedik", "ötödik", "hatodik", "hetedik"};
        System.out.println("A tömb minden 2. elemének kiírása. ");

        while (index < strings.length) {

            System.out.println(strings[index]);
            index += 2;
        }

        System.out.println("A tömb elemeinek visszafelé kiírása.");
        index = strings.length-1;
        while (index >= 0) {

            System.out.println(strings[index]);
            index --;
        }

        System.out.println();

        System.out.println("Tömb elemei, amelyek nagyobbak 1582-nél.");
        int[] years = {1999, 1988, 2006, 1743, 965, 2022, 1349, 1582, 1222, 1876, 2001, 1946, 1482};
        index = 0;
        while ( index  < years.length) {
            if (years[index] > 1582) {
                System.out.println(years[index]);
            }
            index ++;
        }

        System.out.println();
        int db = 0;
        while ( index  < years.length) {
            if (years[index] > 1582) {
                db ++;
            }
            index ++;
        }
        System.out.println("Összesen " + db + " db 1582-nél nagyobb eleme van a tömbnek.");
        System.out.println("Vége a mai napnak.");
    }
}
