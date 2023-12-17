package Controller;

import Interface.IBox;
import Interface.IContainer;
import Interface.IFabricToys;
import Interface.IView;
import Model.*;
import View.View;

public class Controller {
    private IFabricToys fabricToys = new FabricToys();
    private IContainer container = new Container();
    private IBox box = container.addToys(fabricToys);
    private IView view = new View();

    public void getView() {
        view.fileWrite(box);
    }
}
