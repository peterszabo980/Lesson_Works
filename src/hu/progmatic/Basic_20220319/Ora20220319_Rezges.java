package hu.progmatic.Basic_20220319;

public class Ora20220319_Rezges {
    public static void main(String[] args) {
        double aktualisKilenges = 10.0;
        double gerjesztes = -1.2;
        double pozitivSzakitasiSzilardsag = 50.0;
        double negativSzakitasiSzilardsag = -50.0;
/*
        int szamlalo = 0;

        //a szakítási szilárdság elérésekor már éppen leszakad a híd
        // Mikor szakad le? (aktualisKilenges >= pozitivSzakitasiSzilardsag)
        //Meddig várun a kanapéból a kataszrtófára?
        // (aktualisKilenges < pozitivSzakitasiSzilardsag)
        while (aktualisKilenges < pozitivSzakitasiSzilardsag) {
            aktualisKilenges *= gerjesztes;
            szamlalo++;
        }
        //System.out.println("Az eltelt szorzások száma: " + szamlalo);
        */
        int pozitivSzamlalo = pozitivSwing(10.0, -1.2, 50.0);
        int negativvSzamlalo = negativSwing(10.0, -1.2, -50.0);
        System.out.println("Az eltelt szorzások száma (felfele): " + pozitivSzamlalo);
        System.out.println("Az eltelt szorzások száma (lefele): " + negativvSzamlalo);
        int pozitivSzamlalo2 = pozitivSwing(aktualisKilenges, gerjesztes, pozitivSzakitasiSzilardsag);
        int negativvSzamlalo2 = negativSwing(aktualisKilenges, gerjesztes, negativSzakitasiSzilardsag);
        System.out.println("Az eltelt szorzások száma (felfele: " + pozitivSzamlalo2);
        System.out.println("Az eltelt szorzások száma (lefele): " + negativvSzamlalo2);

    }

    public static int pozitivSwing(double aktualisKilenges, double gerjesztes, double pozitivSzakitasiSzilardsag){
        int szamlalo = 0;

        //a szakítási szilárdság elérésekor már éppen leszakad a híd
        // Mikor szakad le? (aktualisKilenges >= pozitivSzakitasiSzilardsag)
        //Meddig várun a kanapéból a kataszrtófára?
        // (aktualisKilenges < pozitivSzakitasiSzilardsag)
        while (aktualisKilenges < pozitivSzakitasiSzilardsag) {
            aktualisKilenges *= gerjesztes;
            szamlalo++;
        } return szamlalo;
    }

    public static int negativSwing(double aktualisKilenges, double gerjesztes, double negativSzakitasiSzilardsag){
        int szamlalo = 0;

        //-20.0 > -50.0
        while (aktualisKilenges > negativSzakitasiSzilardsag) {
            aktualisKilenges *= gerjesztes;
            szamlalo++;
        } return szamlalo;
    }

}

