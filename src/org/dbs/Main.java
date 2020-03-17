package org.dbs;

public class Main {

    public static void main(String[] args) {
        FileAttente fA = new FileAttente();
        initVol(fA);
        appelVoyageur(fA);

        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("DanielMissud"));
    }

    private static String accum(String sWrk) {
        StringBuilder result = new StringBuilder();
        char[] aWrk = sWrk.toCharArray();
        int pos = 0;
        for (char aChar : aWrk) {
            if (pos > 0) {
                result.append('-');
            }
            result.append(Character.toUpperCase(aChar));
            for (int loop = 0; loop < pos; loop++) {
                result.append(Character.toLowerCase(aChar));
            }
            pos++;
        }
        return result.toString();
    }

    private static void appelVoyageur(FileAttente fA) {
        fA.appelVoyageur();
    }

    private static void initVol(FileAttente fA) {
        Voyageur wVoy;
        wVoy = new Voyageur("Voyageur 1", 1000, 11, Classe.Business);
        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 2", 1001, 12, Classe.Business);
        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 3", 1002, 13, Classe.Business);
        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 4", 1004, 41, Classe.Premiere);
        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 5", 1005, 42, Classe.Premiere);
        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 6", 1006, 101, Classe.Economique);
        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 7", 1007, 102, Classe.Economique);
        fA.enregistre(wVoy);
//        wVoy = new Voyageur("Voyageur 51", 1005, 42,Classe.Premiere);
//        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 8", 1008, 103, Classe.Economique);
        fA.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 9", 1009, 104, Classe.Economique);
        fA.enregistre(wVoy);
    }
}
