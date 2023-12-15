package Model;

import java.util.List;

public interface IContainer {
    List<Toys> addToys(IFabricToys fabricToys);
    int size();
    public List<Toys> getMinToys();
    public List<Toys> getMiddleToys();
    public List<Toys> getMaxToys();
}
