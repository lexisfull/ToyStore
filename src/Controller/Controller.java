package Controller;

import Interface.IFabricToys;
import Model.*;

public class Controller {
    IFabricToys fabricToys = new FabricToys<>();
    Container container = new Container();
    Box<Toy> toyContain = container.addToys(fabricToys);

    public Box<Toy> getToyContain(){
        return toyContain;
    }
}
