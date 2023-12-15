package Model;

import java.util.ArrayList;
import java.util.List;

public class Container implements IContainer{
    private List<Toys> toys = new ArrayList<>();




    @Override
    public List<Toys> addToys(IFabricToys fabricToys) {
        for (int i = 0; i < 20; i++) {
            toys.add(fabricToys.fabricToys());
        }
        return toys;
    }


    public int size(){
        return toys.size();
    }

    @Override
    public List<Toys> getMinToys() {
        return null;
    }

    @Override
    public List<Toys> getMiddleToys() {
        return null;
    }

    @Override
    public List<Toys> getMaxToys() {
        return null;
    }
}
