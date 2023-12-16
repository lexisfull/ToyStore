package Model;

import java.util.ArrayList;
import java.util.List;

public class Container implements IContainer{
    IFabricToys fabricToys;
    private List<Toys> toys = new ArrayList<>();
    private int index;

    @Override
    public List<Toys> addToys(IFabricToys fabricToys) {
        for (int i = 0; i < 20; i++) {
            index = i;
            toys.add(fabricToys.fabricToys());
        }
        return toys;
    }
    @Override
    public int size(){
        return toys.size();
    }

}
