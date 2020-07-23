package work.example.animal;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import work.example.Food.FoodEnum;

import static work.example.Food.FoodEnum.FROG;
import static work.example.Food.FoodEnum.SEAWEED;

public class Duck extends Animal {
    protected transient Logger log = LogManager.getLogger(this.getClass());
    public Duck() {
        name = "Утка";
    }

    public void eat(FoodEnum foodEnum) {

        if (foodEnum == FROG || foodEnum == SEAWEED) {
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
