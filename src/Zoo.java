import Food.Chicken;
import Food.FoodEnum;
import animal.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoo {
    private List<Aviary> aviarys = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        Zoo zoo = new Zoo();
        Aviary herbivoreAviary = new Aviary(9);
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
        herbivoreAviary.addAnimal(new Cow());
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
        Aviary carnivoriusAviary2 = new Aviary(8);
        carnivoriusAviary2.addAnimal(new Rabbit());
        carnivoriusAviary2.addAnimal(new Rabbit());
        carnivoriusAviary2.addAnimal(new Rabbit());
        carnivoriusAviary2.addAnimal(new Duck());
        carnivoriusAviary2.addAnimal(new Duck());
        carnivoriusAviary2.addAnimal(new Giraffe());
        zoo.addAviary(carnivoriusAviary2);

        ArrayList <FoodEnum> listfood= new ArrayList<>();

            listfood.add(FoodEnum.CABBAGE);
            listfood.add(FoodEnum.CHICKEN);
            listfood.add(FoodEnum.GRASS);
            listfood.add(FoodEnum.FROG);
            listfood.add(FoodEnum.MEAT);
            listfood.add(FoodEnum.SEAWEED);



        for (Aviary aviary : zoo.getAviarys()) {
            for (Animal animal : aviary.getAnimals()) {
                int ram = random.nextInt(6);
                animal.eat(listfood.get(ram));
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
