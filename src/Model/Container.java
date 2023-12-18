package Model;

import Interface.IBox;
import Interface.IContainer;
import Interface.ICustomToy;
import Interface.IToysFabric;

public class Container implements IContainer {
    private IBox toys = new Box();
    private IBox customToys = new Box();

    public IBox addToys(IToysFabric fabricToys) {
        for (int i = 0; i < 10; i++) {
            toys.addToys(fabricToys.getToy());
        }
        return toys;
    }

    public IBox addCustomToys(ICustomToy customToy){
        var toys = customToy.getCustomToy();
        for (int i = 0; i < toys.size(); i++) {
            if(toys.get(i).getWeight() == Randomizer.random(toys.size())){
                customToys.addToys(toys.get(i));
                toys.remove(i);
            }
        }
        return customToys;
    }

    @Override
    public int size() {
        return toys.getSize();
    }

}
