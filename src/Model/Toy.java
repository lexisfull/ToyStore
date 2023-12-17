package Model;

// Класс игрушка. Компарабл для добавления в приоритетную очередь
public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "toy: ( " +
                "Вероятность = " + weight +
                ", название = '" + name + '\'' +
                ", id = " + weight + " )" + "\n";
    }

    //  Компаратор сортирует объект по weight
    @Override
    public int compareTo(Toy toy) {
        return weight - toy.weight;
    }
}
