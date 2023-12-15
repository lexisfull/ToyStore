import Controller.Controller;
import Model.FabricToys;
import Model.IFabricToys;
import Model.Toys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var controller = new Controller();
        System.out.println(controller.getToys());
    }
}