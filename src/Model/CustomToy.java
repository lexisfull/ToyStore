package Model;
import Interface.IBox;
import Interface.ICustomToy;

import java.util.*;

public class CustomToy<T extends Toy> implements ICustomToy {
    private static final Scanner scanner = new Scanner(System.in);
    private List<Toy> toyList = new ArrayList<>();
    private Queue<Integer> id;
    private Queue<String> names;
    private Queue<Integer> weight;
    private int idToy;
    private String name;
    private int weightToy;

    public List<Toy> getCustomToy() {
        id = new LinkedList<>();
        names = new LinkedList<>();
        weight = new LinkedList<>();
        String str = "";

        while (!str.equals("n")) {
            addId();
            addName();
            addWeight();

            System.out.println("Продолжим? введите - н, если нет или любой" +
                    "другой непустой символ для продолжения");
            str = scanner.next();
        }

        while (!id.isEmpty()) {
            idToy = id.poll();
            name = names.poll();
            weightToy = weight.poll();
            toyList.add(new Toy(idToy, name, weightToy));
        }
        return toyList;
    }


    private boolean addId() {
        System.out.println("Введите id: ");
        int digit = scanner.nextInt();
        return id.add(digit);
    }

    private boolean addWeight() {
        System.out.println("Введите вероятность выпадения от 1 до 3: ");
        int mass = scanner.nextInt();
        return weight.add(mass);
    }

    private boolean addName() {
        System.out.println("Введите название: ");
        String designation = scanner.next();
        return names.add(designation);
    }
}
