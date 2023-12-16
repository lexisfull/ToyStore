package Model;

public class Toy {
    private int id;
    private String name;
    private  int  weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Toy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "toy: ( " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", weight = " + weight + " )" + "\n";
    }
}
