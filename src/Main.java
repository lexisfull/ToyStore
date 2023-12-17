import Controller.Controller;
import Model.CustomToy;
import Model.Toy;

import java.util.*;


public class Main {
    public static void main(String[] args) {
//        Controller controller = new Controller();
//        controller.getView();
        CustomToy customToy = new CustomToy();
        System.out.println(customToy.getToy());
    }
}