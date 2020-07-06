package animal;

import Food.FoodEnum;

import static Food.FoodEnum.FROG;
import static Food.FoodEnum.SEAWEED;

public class Duck extends Animal {
    public Duck() {
        name = "Утка";
    }

    public void eat(FoodEnum foodEnum) {

        if (foodEnum == FROG || foodEnum == SEAWEED) {
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
