package animal;


import Food.Food;
import Food.PlantFood;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof PlantFood) {
            System.out.println("ммм... Сочная травка");
        }else {
            System.out.println("Я не ем мяса");
        }
    }
}

