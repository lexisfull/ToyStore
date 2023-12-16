package Interface;

import Model.Contain;
import Model.IFabricToys;
import Model.Toy;

import java.util.List;

public interface IContainer {
    Contain<Toy> addToys(IFabricToys fabricToys);
    int size();

}
