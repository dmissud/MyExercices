package org.dbs;

import java.util.PriorityQueue;
import java.util.Queue;

public class FileAttente {
    Queue<Voyageur> queue;

    public FileAttente() {
        this.queue = new PriorityQueue<>(new VoyageurComparateur());
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
