package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    IFabricToys fabricToys = new FabricToys<>();
    IContainer container = new Container();
    List<Toys> toys = container.addToys(fabricToys);

    public List<Toys> getToys() {
        return toys;
    }
}
