import Controller.Controller;
import Model.*;


public class Main {
    public static void main(String[] args) {

//        Contain<Toy> toyContain = new Contain<>();
//        IFabricToys fabricToys = new FabricToys<>();
//        toyContain.addToys(fabricToys.fabricToys());
//        System.out.println(toyContain);
        Controller controller = new Controller();
        var toys = controller.getToyContain();
        for (int i = 0; i < 7; i++) {
            System.out.println(toys.getIndex(i));

        }
        System.out.println("-----------");
        System.out.println(toys.getIndex(7).getWeight());
        System.out.println("---------------");
        System.out.println(toys.getIndex(7));
        System.out.println("----------------");
        System.out.println(toys);

    }
}