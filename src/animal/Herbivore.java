package animal;


import Food.Food;
import Food.PlantFood;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof PlantFood) {
            System.out.println("Я " + name + " и я люблю сочную травку");
        }else {
            System.out.println("Я " + name + " и я кушаю только травку");
        }
    }
}

