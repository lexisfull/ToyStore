package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private IFabricToys fabricToys = new FabricToys<>();
    private IContainer container = new Container();
    private List<Toys> toys = container.addToys(fabricToys);


    public List<Toys> getToys() {
        return toys;
    }
}
