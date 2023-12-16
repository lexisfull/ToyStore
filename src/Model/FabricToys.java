package Model;

import java.util.Random;

public class FabricToys <T extends Toys> implements IFabricToys{

    private static Random random = new Random();
    private String[] names = {"Шарик", "Мяч резиновый", "Кубик", "Пистолет",
            "Лук", "Меч", "Машина", "Вертолет", "Квадрокоптер"};
    private int weight;
    private int id;



    public Toys fabricToys() {
        int temp = random.nextInt(999);
        if(temp <= 333){
            weight = 1;
        } else if (temp <= 666 && temp > 333) {
            weight = 2;
        }else {
            weight = 3;
        }
        if(weight == 1){
            id = random.nextInt(3);
        }else if(weight == 2){
            id = random.nextInt(6);
        }else {
            id = random.nextInt(9);
        }
        return new Toys(id + 1, names[id], weight);
    }

    @Override
    public int getWight() {
        return getWight();
    }

    public String getName(){
        return names[id];
    }

}
