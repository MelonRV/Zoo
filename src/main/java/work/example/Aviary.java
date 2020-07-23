package work.example;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import work.example.animal.Animal;

import java.util.ArrayList;

public class Aviary {

    protected transient Logger log = LogManager.getLogger(this.getClass());
    private ArrayList<Animal> aviary = new ArrayList<>();


    int maxAnimals;

    public Aviary(int maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public void addAnimal(Animal animal) {
        if (aviary.size() < maxAnimals) {
            aviary.add(animal);
        } else log.error("Вольер полон. Всего мест: " + maxAnimals);
    }

    public ArrayList<Animal> getAnimals() {
        return aviary;
    }
}
