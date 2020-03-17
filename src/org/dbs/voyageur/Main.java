package org.dbs.voyageur;

public class Main {

    public static final int NUMERO_INIT = 1000;

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
        int numero = NUMERO_INIT;

        wVoy = new Voyageur("Voyageur 7", numero++, 102, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 1", numero++, 10, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 8", numero++, 103, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 3", numero++, 13, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 4", numero++, 41, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 6", numero++, 101, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 5", numero++, 42, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 2", numero++, 12, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 9", numero++, 104, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 17", numero++, 112, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 11", numero++, 11, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 18", numero++, 113, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 13", numero++, 15, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 14", numero++, 43, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 16", numero++, 111, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 15", numero++, 44, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 12", numero++, 16, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 19", numero++, 114, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 27", numero++, 122, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 21", numero++, 17, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 28", numero++, 123, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 23", numero++, 18, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 24", numero++, 45, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 26", numero++, 121, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 25", numero++, 46, ClasseEconomique.Premiere);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 22", numero++, 19, ClasseEconomique.Business);
        salleAttente.enregistre(wVoy);
        wVoy = new Voyageur("Voyageur 29", numero++, 124, ClasseEconomique.Economique);
        salleAttente.enregistre(wVoy);

        System.out.println("Voyageur enregistré : "+(numero-NUMERO_INIT));
    }
}
