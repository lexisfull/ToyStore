package Model;

import java.util.Random;

public class FabricToys <T extends Toys> implements IFabricToys{

    private static Random random = new Random();
    private Toys toys;


    public Toys fabricToys() {
        int temp = random.nextInt(999);
        int weight;
        if(temp <= 333){
            weight = 1;
        } else if (temp <= 666) {
            weight = 2;
        }else {
            weight = 3;
        }
        String[] name = {"Шарик", "Мяч резиновый", "Кубик", "Пистолет",
                "Лук", "Меч", "Машина", "Вертолет", "Квадрокоптер"};
        int id;
        if(weight == 1){
            id = random.nextInt(3);
        }else if(weight == 2){
            id = random.nextInt(6);
        }else {
            id = random.nextInt(9);
        }
        return new Toys(id + 1, name[id], weight);
    }

}
