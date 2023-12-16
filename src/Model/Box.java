package Model;

import java.util.ArrayList;
import java.util.List;
// Коробка для объектов типа той
public class Box<T extends Toy> {
    private Toy toy;
    private int id;
    private int weight;
    private List<T> toys = new ArrayList<>();
    // Добавление объекта в коробку
    public boolean addToys(Toy toy){
        return toys.add((T) toy);
    }
    // Возвращаем индекс объекта
    public T getIndex(int id){
        return toys.get(id);
    }
    // Возвращаем размер коробки
    public int getSize(){
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
