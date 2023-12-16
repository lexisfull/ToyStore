package Model;

import Interface.IContainer;
import Interface.IFabricToys;

public class Container implements IContainer {
    private Box<Toy> toys = new Box<>();


    @Override
    public Box<Toy> addToys(IFabricToys fabricToys) {
        for (int i = 0; i < 20; i++) {
            toys.addToys(fabricToys.fabricToys());
        }
        return toys;
    }
    @Override
    public int size(){
        return toys.getSize();
    }

}
