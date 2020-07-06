package animal;

import Food.FoodEnum;

import static Food.FoodEnum.CHICKEN;
import static Food.FoodEnum.MEAT;

public abstract class Carnivorius extends Animal {


    public void eat(FoodEnum foodEnum) {
        if (foodEnum == CHICKEN || foodEnum == MEAT) {

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
