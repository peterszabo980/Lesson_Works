package hu.progmatic.LW_20220319;

public class Ora20220319_Alvo {
    public static void main(String[] args) {

        System.out.println(sleepingStrudents(20,15,5));
        System.out.println(sleepingStudentsAdvanced(20,15,5));
        System.out.println(sleepingStrudents(20,5,5));
        System.out.println(sleepingStudentsAdvanced(20,5,5));
    }
    //4. feladat
    public static int sleepingStrudents(int total, int ready, int working) {
        return total - ready - working;

    }
    //5. feladat
    public static int sleepingStudentsAdvanced(int total, int ready, int working) {
        int sleeping = total - ready - working;
        if (sleeping * 4 > total) {
            sleeping += working /2;  //ha egész osztást végzünk, akkor a tört rész elveszik és automatikusan lefele kerekít
        }
        return sleeping;
    }
}
