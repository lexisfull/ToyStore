package Model;

import Interface.IContainer;
import Interface.IFabricToys;

public class Container implements IContainer {
    private IFabricToys fabricToys;
    private Box<Toy> toys = new Box<>();

    public Box<Toy> addToys(IFabricToys fabricToys) {
        for (int i = 0; i < 20; i++) {
            toys.addToys(fabricToys.getToy());
        }
        return toys;
    }

    @Override
    public int size() {
        return toys.getSize();
    }

}
