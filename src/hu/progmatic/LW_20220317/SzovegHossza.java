package hu.progmatic.LW_20220317;

public class SzovegHossza {
    public static void main(String[] args) {
        int szam = szovegHossza("Hello") * 2;
        System.out.println(szam);

        String szoveg = betuSokszor("o", 5);
        System.out.println(szoveg);
    }

    public static int szovegHossza(String szoveg) {
        return szoveg.length();
    }

    public static String betuSokszor(String betu, int darab) {
        String szoveg = "";

        for (int i = 0; i < darab; i++) {
            szoveg += betu;
        }
        return szoveg;
    }

}
