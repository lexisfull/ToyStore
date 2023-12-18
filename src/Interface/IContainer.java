package Interface;

public interface IContainer {
    IBox addCustomToys(ICustomToy customToy);
    IBox addToys(IToysFabric fabricToys);
    int size();

}
