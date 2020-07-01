package animal;

import Food.Food;
import Food.PredatorFood;

public abstract class Carnivorius extends Animal {
    @Override
   public void eat(Food food) {
        if (food instanceof PredatorFood) {
            System.out.println("ммм... Мясцо");
        } else {
            System.out.println("Сам жуй эту траву");
        }
    }
}
