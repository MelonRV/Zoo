package animal;

import Food.Food;
import Food.PredatorFood;

public abstract class Carnivorius extends Animal {


    public void eat(Food food) {
        if (food instanceof PredatorFood) {
            System.out.println("Я " + name + " и я люблю мясо");
        } else {
            System.out.println("Я " + name + " это значит я хищник, смекаешь..");
        }
    }
}
