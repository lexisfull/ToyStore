package Controller;

import Interface.*;
import Model.*;
import View.View;

import java.util.Scanner;

// Создаем экземпляры классов и передаем на печать
public class Controller {
    //    Создал фабрику игрушек
    private final IToysFabric fabricToys = new ToysFabric();
    //    Упаковка в бокс
    private final IContainer container = new Container();
    private final ICustomToy customToy = new CustomToy();
    //    Создали бокс на основе приоритетной очереди
    private IBox box = new Box();
    private IBox box1 = new Box();

    private final IView view = new View();


    public void getView() {
        System.out.println("Выберите способ\n" +
                "1 - вручную ввести данные,\n" +
                "2 - 'фабричный' способ.");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        switch (temp) {
            case 2:
                view.fileWrite(box1 = container.addFabricToys(fabricToys));
                break;
            case 1:
                view.fileWrite(box = container.addCustomToys(customToy));
                break;
        }


    }
}
