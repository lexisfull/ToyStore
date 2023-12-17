package Model;
import java.util.*;

public class CustomToy<T extends Toy> {
    private static final Scanner scanner = new Scanner(System.in);
    private Queue<Integer> id;
    private Queue<String> names;
    private Queue<Integer> weight;
    private int idToy;
    private String name;
    private int weightToy;

    public Toy getToy() {
        id = new LinkedList<>();
        names = new LinkedList<>();
        weight = new LinkedList<>();
        String str = "";

        while (!str.equals("n")) {
            addId();
            addName();
            addWeight();

            System.out.println("Продолжим? д/н");
            str = scanner.next();
        }

        while (!id.isEmpty()) {
            idToy = id.poll();
            name = names.poll();
            weightToy = weight.poll();
        }
        return new Toy(idToy, name, weightToy);
    }

    private boolean addId() throws NumberFormatException{
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
        String designation = scanner.nextLine();
        return names.add(designation);
    }
}
