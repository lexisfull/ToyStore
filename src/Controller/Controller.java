package Controller;

import Interface.*;
import Model.*;
import View.View;

import java.util.Scanner;

// Создаем экземпляры классов и передаем на печать
public class Controller {
    //    Создал фабрику игрушек
    private IToysFabric fabricToys = new ToysFabric();
    //    Упаковка в бокс
    private IContainer container = new Container();
    private ICustomToy customToy = new CustomToy();
    //    Создали бокс на основе приоритетной очереди
    private IBox box = container.addCustomToys(customToy);
    private IView view = new View();

    public void getView() {
        view.fileWrite(box);
    }
}
