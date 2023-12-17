package Interface;

import Model.Box;
import Model.Toy;

public interface IContainer {
    IBox addToys(IFabricToys fabricToys);

    int size();

}
