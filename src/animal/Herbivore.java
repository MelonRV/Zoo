package animal;


import Food.FoodEnum;

import static Food.FoodEnum.CABBAGE;
import static Food.FoodEnum.GRASS;


public abstract class Herbivore extends Animal {

    @Override
    public void eat(FoodEnum foodEnum) {


        if (foodEnum == CABBAGE || foodEnum == GRASS) {
            System.out.println("Это " + foodEnum.getFoodname() + ". Я " + name + " и это я люблю.");
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Это " + foodEnum.getFoodname() + ". А я " + name + " и я такое не ем.");
            }

        }

    }
}

