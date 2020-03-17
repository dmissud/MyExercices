package org.dbs.voyageur;

import java.util.Comparator;

public class VoyageurComparateur implements Comparator<Voyageur> {
    @Override
    public int compare(Voyageur voyageur, Voyageur t1) {
        if (t1.getClasse().ordinal() < voyageur.getClasse().ordinal()) {
            return 1;
        } else {
            if (t1.getClasse().ordinal() == voyageur.getClasse().ordinal()) {
                if (t1.getSiege() < voyageur.getSiege()) {
                    return 1;
                } else {
                    if (t1.getSiege() == voyageur.getSiege()) {
                        if (t1.getNumero() == voyageur.getNumero()) {
                            if (t1.getNom().equals(voyageur.getNom())) {
                                return 0;
                            }
                        }
                        System.out.println("--------------------\nVoyageur incoherent\n" + t1 + "\n" + voyageur + "\n----------------");
                        return 1;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        }
    }
}
