package work.example.animal;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import work.example.Food.FoodEnum;

import static work.example.Food.FoodEnum.CHICKEN;
import static work.example.Food.FoodEnum.MEAT;

public abstract class Carnivorius extends Animal {

    protected transient Logger log = LogManager.getLogger(this.getClass());


    public void eat(FoodEnum foodEnum) {
        if (foodEnum == CHICKEN || foodEnum == MEAT) {

            log.info("Это " + foodEnum.getFoodname() + ". Я " + name + " и это я люблю.");
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                log.error("Это " + foodEnum.getFoodname() + ". А я " + name + " и я такое не ем.");
            }

        }
    }
}
