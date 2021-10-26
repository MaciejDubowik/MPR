package sandwichExercise;

import sandwichExercise.enums.BreadEnum;
import sandwichExercise.enums.CookingEnum;
import sandwichExercise.enums.MeatEnum;
import sandwichExercise.enums.VegetableEnum;

public class Restaurant {

    public Sandwich orderSandwich(BreadEnum breadType,
        MeatEnum meatType, VegetableEnum vegType, CookingEnum cookingLevel) {

        Sandwich sandwich = new Sandwich();
        Bread bread = new Bread(breadType);
        Meat meat = new Meat(meatType);
        Oven oven = new Oven();
        Vegetable veg = new Vegetable(vegType);

        sandwich.setBread(bread);
        sandwich.setMeat(meat);
        oven.cook(sandwich, cookingLevel);
        sandwich.setVegetable(veg);

        return sandwich;

    }
}
