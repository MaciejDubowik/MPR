package sandwichExercise;

import sandwichExercise.enums.BreadEnum;
import sandwichExercise.enums.CookingEnum;

public class Bread {

    BreadEnum type;
    int cookingLevel = 0;
    boolean burnt = false;

    public Bread(BreadEnum type) {
        this.type = type;
    }

    public BreadEnum getType() {
        return type;
    }

    public void setType(BreadEnum type) {
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
