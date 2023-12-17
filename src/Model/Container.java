package Model;

import Interface.IBox;
import Interface.IContainer;
import Interface.IToysFabric;

public class Container implements IContainer {
    private IBox toys = new Box();

    public IBox addToys(IToysFabric fabricToys) {
        for (int i = 0; i < 10; i++) {
            toys.addToys(fabricToys.getToy());
        }
        return toys;
    }

    @Override
    public int size() {
        return toys.getSize();
    }

}
