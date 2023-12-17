package Model;

import Interface.IBox;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
    Коробка для объектов типа Toy,
    за основу взята PriorityQueue в соответствии с ТЗ
 */
public class Box implements IBox {
    private Toy toy;
    private int id;
    private int weight;
    private Queue<Toy> toys = new PriorityQueue<>();

    // Добавление объекта в коробку
    public boolean addToys(Toy toy) {
        return toys.add(toy);
    }

    public boolean next(){
        return toys.isEmpty();
    }

    // Возвращаем индекс объекта
    public Toy get(){
        return toys.poll();
    }

    public Toy delete(){
        return toys.remove();
    }

    // Возвращаем размер коробки
    public int getSize() {
        return toys.size();
    }

    // Возвращаем вес объекта
    public int getWeight() {
        return toy.getWeight();
    }

    @Override
    public String toString() {
        return String.format(toys.toString());
    }
}
