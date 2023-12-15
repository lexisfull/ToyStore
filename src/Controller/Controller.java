package Controller;

import Model.FabricToys;
import Model.IFabricToys;
import Model.Toys;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private IFabricToys fabricToys = new FabricToys<>();
    private List<Toys> toysMin = new ArrayList<>();

    public List<Toys> addToys(){
        for (int i = 0; i < 10; i++) {
            if(fabricToys.getWight() < 2) {
                toysMin.add(fabricToys.fabricToys());
            }

        }
        return toysMin;
    }

}
