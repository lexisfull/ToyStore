package Model;

import Interface.IBox;

import java.util.PriorityQueue;

public class PutInQueue {
    private static PriorityQueue<Toy> queueToys = new PriorityQueue<>();

    public static PriorityQueue<Toy> getQueueToys(IBox<Toy> box) {
        for (int i = 0; i < box.getSize(); i++) {
            queueToys.add(box.getIndex(i));
        }
        return queueToys;
    }
}