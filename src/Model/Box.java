package Model;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Toy> {
    private Toy toy;
    private int id;
    private int weight;
    private List<T> toys = new ArrayList<>();
    public boolean addToys(Toy toy){
        return toys.add((T) toy);
    }

    public T getIndex(int id){
        return toys.get(id);
    }
    public int getSize(){
        return toys.size();
    }

    public int getWeight() {
        return toy.getWeight();
    }

    @Override
    public String toString() {
        return String.format(toys.toString());
    }
}
