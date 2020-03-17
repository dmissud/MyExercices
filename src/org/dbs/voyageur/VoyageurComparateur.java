package org.dbs.voyageur;

import java.util.Comparator;

// je préfère avec le comparable dans la version en conf cette classe est pas utilisé
public class VoyageurComparateur implements Comparator<Voyageur> {
    @Override
    public int compare(Voyageur voyageur, Voyageur t1) {
        return voyageur.compareTo(t1);
    }
}
