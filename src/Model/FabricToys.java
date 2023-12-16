package Model;

import Interface.IFabricToys;

import java.util.Random;

// Генератор игрушек. Вместо дополнительных массивов использовал генерацию
// что бы не усложнять программу и сделать более гибкой.
public class FabricToys<T extends Toy> implements IFabricToys {
    private Toy toy;

    private static final Random random = new Random();
    private static final String[] names = {"Шарик", "Мяч резиновый", "Кубик", "Пистолет",
            "Лук", "Меч", "Машина", "Вертолет", "Квадрокоптер"};

    private static int id;
    private static int weight;

    @Override
    public Toy getToy() {
        weight = random.nextInt(3) + 1;

        if (weight == 1) {
            id = random.nextInt(3);
        } else if (weight == 2) {
            id = random.nextInt(6);
        } else {
            id = random.nextInt(9);
        }
        return new Toy(id + 1, names[id], weight);
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return names[id];
    }

}
