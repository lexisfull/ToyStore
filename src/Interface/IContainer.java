package Interface;

import Model.Box;
import Model.Toy;

public interface IContainer {
    Box addToys(IFabricToys fabricToys);

    int size();

}
