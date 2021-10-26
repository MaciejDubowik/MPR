package sandwichExercise;

import sandwichExercise.enums.CookingEnum;
import sandwichExercise.enums.MeatEnum;

public class Meat {

    MeatEnum type;
    int cookingLevel = 0;
    boolean burnt = false;


    public Meat(MeatEnum type) {
        this.type = type;
    }

    public MeatEnum getType() {
        return type;
    }

    public void setType(MeatEnum type) {
        this.type = type;
    }

    public int getCookingLevel() {
        return cookingLevel;
    }

    public void setCookingLevel(int cookingLevel) {
        this.cookingLevel = cookingLevel;
    }

    public void increaseCookingLevel(int amount) {
        this.cookingLevel += amount;
        if (cookingLevel > 5) {
            burnt = true;
            cookingLevel = 1000;
        }
    }
}
