package org.dbs.voyageur;

import java.util.Objects;

public class Voyageur implements Comparable<Voyageur> {
    private String nom;
    private int numero;
    private int siege;
    private ClasseEconomique classeEconomique;

    public Voyageur(String nom, int numero, int siege, ClasseEconomique classeEconomique) {
        this.nom = nom;
        this.numero = numero;
        this.siege = siege;
        this.classeEconomique = classeEconomique;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                ", siege=" + siege +
                ", classe=" + classeEconomique +
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
                classeEconomique == voyageur.classeEconomique;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, numero, siege, classeEconomique);
    }

    @Override
    public int compareTo(Voyageur voyageur) {
        if (this.getClasseEconomique().ordinal() < voyageur.getClasseEconomique().ordinal()) {
            return -1;
        } else {
            if (this.getClasseEconomique().ordinal() == voyageur.getClasseEconomique().ordinal()) {
                if (this.siege < voyageur.getSiege()) {
                    return -1;
                } else {
                    if (this.siege == voyageur.getSiege()) {
                        if (this.numero == voyageur.getNumero()) {
                            if (this.nom.equals(voyageur.getNom())) {
                                return 0;
                            }
                        }
                        System.out.println("--------------------\nVoyageur incoherent\n"
                                + this + "\n" + voyageur + "\n----------------");
                        return -1;
                    } else {
                        return 1;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public int getSiege() {
        return siege;
    }

    public ClasseEconomique getClasseEconomique() {
        return classeEconomique;
    }
}
