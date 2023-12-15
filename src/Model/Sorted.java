package Model;

import java.util.ArrayList;
import java.util.List;

public class Sorted {
    private List<Toys> minToys = new ArrayList<>();
    private List<Toys> middleToys = new ArrayList<>();
    private List<Toys> maxToys = new ArrayList<>();

    public List<Toys> getMinToys() {
        return minToys;
    }

    public List<Toys> getMiddleToys() {
        return middleToys;
    }

    public List<Toys> getMaxToys() {
        return maxToys;
    }
}
