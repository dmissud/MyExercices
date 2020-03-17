package org.dbs.voyageur;

import java.util.PriorityQueue;
import java.util.Queue;

public class SalleAttente {
    Queue<Voyageur> queue;

    public SalleAttente() {
        this.queue = new PriorityQueue<>();
    }

    public void enregistre(Voyageur wVoy) {
        queue.add(wVoy);
    }

    public void appelVoyageur() {
        for (Voyageur voyageur : queue) {
            System.out.println(voyageur);
        }
    }
}
