import Food.Chicken;
import animal.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Aviary> aviarys = new ArrayList<>();

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Aviary herbivoreAviary = new Aviary(8);
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
        zoo.addAviary(herbivoreAviary);

        Aviary carnivoriusAviary = new Aviary(6);
        carnivoriusAviary.addAnimal(new Bear());
        carnivoriusAviary.addAnimal(new Lion());
        carnivoriusAviary.addAnimal(new Tiger());
        carnivoriusAviary.addAnimal(new Bear());
        carnivoriusAviary.addAnimal(new Duck());
        carnivoriusAviary.addAnimal(new Giraffe());
        zoo.addAviary(carnivoriusAviary);

        Aviary carnivoriusAviary2 = new Aviary(4);
        carnivoriusAviary2.addAnimal(new Rabbit());
        carnivoriusAviary2.addAnimal(new Rabbit());
        carnivoriusAviary2.addAnimal(new Rabbit());
        carnivoriusAviary2.addAnimal(new Duck());
        carnivoriusAviary2.addAnimal(new Giraffe());
        zoo.addAviary(carnivoriusAviary2);



        for (Aviary aviary : zoo.getAviarys()) {
            for (Animal animal : aviary.getAnimals()) {
                animal.eat(new Chicken());
                }

        }


    }

    private void addAviary(Aviary aviary) {
        aviarys.add(aviary);
    }

    public List<Aviary> getAviarys() {
        return aviarys;
    }
}
