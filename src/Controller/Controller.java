package Controller;

import Interface.*;
import Model.*;
import View.View;

// Создаем экземпляры классов и передаем на печать
public class Controller {
    //    Создал фабрику игрушек
    private IToysFabric fabricToys = new ToysFabric();
    //    Упаковка в бокс
    private IContainer container = new Container();
    ICustomToy customToy = new CustomToy();
    //    Создали бокс на основе приоритетной очереди

    private IView view = new View();

    public void getView() {
        view.fileWrite(container.addCustomToys(customToy));
    }
}
