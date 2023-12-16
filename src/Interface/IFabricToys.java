package Interface;

import Model.Box;
import Model.Toy;

public interface IFabricToys {
    Toy getToy();

    int getWeight();

    public String getName();
}
