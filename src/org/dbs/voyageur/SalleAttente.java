package org.dbs.voyageur;

import java.util.PriorityQueue;
import java.util.Queue;

public class SalleAttente {
    final Queue<Voyageur> queue;

    public SalleAttente() {
        this.queue = new PriorityQueue<>();
    }

    public void enregistre(Voyageur wVoy) {
        queue.add(wVoy);
    }

    public void appelVoyageur() {
        while (!queue.isEmpty()) {
            Voyageur voyageur = queue.remove();
            System.out.println(voyageur);
        }
    }
}
