import Controller.Controller;
import Interface.IBox;
import Model.Box;
import Model.Dino;
import Model.FabricToys;
import Model.Toy;

import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        var toy = controller.getToys();
        System.out.println(toy);
        Toy toy1 = new Dino(10 , "jhgjgjhg", 5);
        Queue<Toy> queue = new PriorityQueue<>();
        queue.add(toy1);
        System.out.println(queue);

    }
}