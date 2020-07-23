package work.example.Food;

public enum FoodEnum {
    CABBAGE("Капуста"),
    CHICKEN("Курица"),
    FROG("Лягушка"),
    MEAT("Мясо"),
    SEAWEED("Водоросли"),
    GRASS("Трава");

    public String foodname;

    FoodEnum(String food) {
        this.foodname = food;
    }

    public String getFoodname() {
        return foodname;
    }
}



