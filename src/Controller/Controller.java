package Controller;

import Interface.IBox;
import Interface.IContainer;
import Interface.IToysFabric;
import Interface.IView;
import Model.*;
import View.View;

// Создаем экземпляры классов и передаем на печать
public class Controller {
    //    Создал фабрику игрушек
    private IToysFabric fabricToys = new ToysFabric();
    //    Упаковка в бокс
    private IContainer container = new Container();
    //    Создали бокс на основе приоритетной очереди
    private IBox box = container.addToys(fabricToys);
    //    Экземпляр для вывода на печать
    private IView view = new View();

    public void getView() {
        view.fileWrite(box);
    }
}
