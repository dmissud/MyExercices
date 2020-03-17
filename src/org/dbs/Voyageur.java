package org.dbs;

import java.util.Objects;

public class Voyageur /*implements Comparable<Voyageur>*/ {
    private String nom;
    private int numero;
    private int siege;
    private Classe classe;

    public Voyageur(String nom, int numero, int siege, Classe classe) {
        this.nom = nom;
        this.numero = numero;
        this.siege = siege;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                ", siege=" + siege +
                ", classe=" + classe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voyageur voyageur = (Voyageur) o;
        return numero == voyageur.numero &&
                siege == voyageur.siege &&
                Objects.equals(nom, voyageur.nom) &&
                classe == voyageur.classe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, numero, siege, classe);
    }

//    @Override
//    public int compareTo(Voyageur voyageur) {
//        if (this.classe.ordinal() < voyageur.getClasse().ordinal()) {
//            return -1;
//        } else {
//            if (this.classe.ordinal() == voyageur.getClasse().ordinal()) {
//                if (this.siege < voyageur.getSiege()) {
//                    return -1;
//                } else {
//                    if (this.siege == voyageur.getSiege()) {
//                        if (this.numero == voyageur.getNumero()) {
//                            if (this.nom.equals(voyageur.getNom())) {
//                                return 0;
//                            }
//                        }
//                        System.out.println("--------------------\nVoyageur incoherent\n" + this + "\n" + voyageur + "\n----------------");
//                        return -1;
//                    } else {
//                        return 1;
//                    }
//                }
//            } else {
//                return 1;
//            }
//        }
//    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public int getSiege() {
        return siege;
    }

    public Classe getClasse() {
        return classe;
    }
}
