import Model.FabricToys;
import Model.IFabricToys;

public class Main {
    public static void main(String[] args) {
        IFabricToys fabricToys = new FabricToys<>();
        IFabricToys fabricToys1 = new FabricToys<>();
        IFabricToys fabricToys2 = new FabricToys<>();
        IFabricToys fabricToys3 = new FabricToys<>();
        IFabricToys fabricToys4 = new FabricToys<>();
        IFabricToys fabricToys5 = new FabricToys<>();
        System.out.println(fabricToys.fabricToys());
        System.out.println(fabricToys1.fabricToys());
        System.out.println(fabricToys2.fabricToys());
        System.out.println(fabricToys3.fabricToys());
        System.out.println(fabricToys4.fabricToys());
        System.out.println(fabricToys5.fabricToys());
    }
}