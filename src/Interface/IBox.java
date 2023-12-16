package Interface;

import Model.Toy;

public interface IBox<T> {
    public T getIndex(int id);
    public int getSize();
    public int getWeight();
    boolean addToys(Toy toy);
}
