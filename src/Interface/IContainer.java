package Interface;

import Model.Box;
import Model.Toy;

public interface IContainer {
    Box<Toy> addToys(IFabricToys fabricToys);
    int size();

}
