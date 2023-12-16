import Controller.Controller;
import Model.Container;
import Model.IContainer;


public class Main {
    public static void main(String[] args) {
        var controller = new Controller();
        System.out.println(controller.getToys().get(1));
        IContainer container = new Container();
        System.out.println(container.getToys(1));
    }
}