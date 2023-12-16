package Controller;

import Interface.IBox;
import Interface.IFabricToys;
import Model.*;

public class Controller {
    IFabricToys fabricToys = new FabricToys();
    Container container = new Container();
    Box<Toy> toys = container.addToys(fabricToys);

    public Box<Toy> getToys() {
        return toys;
    }
}
