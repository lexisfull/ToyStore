package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricToys {

    private static Random random = new Random();
    private static int weight = random.nextInt(1000);


    List<Toys> toys = new ArrayList<>();
    public static String getNameToys() {
        String[] names1 = {"Gun", "Bow", "Shotgun"};
        String[] names2 = {"Doll", "Soldier", "Dinosaur"};
        String name = null;
        if(weight < 500){
            name = names1[random.nextInt(names1.length)];
        }
        if(weight > 500){
            name = names2[random.nextInt(names1.length)];
        }
        return  name;
    }



}
