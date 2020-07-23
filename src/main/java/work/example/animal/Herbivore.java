package work.example.animal;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import work.example.Food.FoodEnum;

import static work.example.Food.FoodEnum.CABBAGE;
import static work.example.Food.FoodEnum.GRASS;


public abstract class Herbivore extends Animal {

    protected transient Logger log = LogManager.getLogger(this.getClass());

    @Override
    public void eat(FoodEnum foodEnum) {


        if (foodEnum == CABBAGE || foodEnum == GRASS) {
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

