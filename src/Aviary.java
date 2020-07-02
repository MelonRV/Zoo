import animal.Animal;

import java.util.ArrayList;

public  class Aviary {
    private ArrayList<Animal> aviary = new ArrayList<>();


    int maxAnimals;

    public Aviary(int maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public void addAnimal(Animal animal) {
        if (aviary.size() < maxAnimals){
            aviary.add(animal);
        }
        else System.err.println("Вольер полон. Всего мест: " + maxAnimals);
    }

    public ArrayList<Animal> getAnimals() {
        return aviary;
    }
}
