package org.dbs.voyageur;

public class Main {

    public static void main(String[] args) {
        SalleAttente fA = new SalleAttente();
        enregistrementVoyageurs(fA);
        embarquements(fA);

    }

    private static void embarquements(SalleAttente fA) {
        fA.appelVoyageur();
    }

    private static void enregistrementVoyageurs(SalleAttente salleAttente) {
        Voyageur wVoy;
        wVoy = new Voyageur("Voyageur 1", 1000, 11, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 2", 1001, 12, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 3", 1002, 13, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 4", 1004, 41, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 5", 1005, 42, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 6", 1006, 101, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 7", 1007, 102, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 8", 1008, 103, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 9", 1009, 104, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
    }
}
