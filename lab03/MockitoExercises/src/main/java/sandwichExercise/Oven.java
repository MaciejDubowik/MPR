package sandwichExercise;

import sandwichExercise.enums.CookingEnum;

public class Oven {

    public void cook(Sandwich sandwich, CookingEnum cookingLevel) {
        switch(cookingLevel) {
            case LOW:
                sandwich.getBread().increaseCookingLevel(1);
                sandwich.getMeat().increaseCookingLevel(1);
                break;
            case MID:
                sandwich.getBread().increaseCookingLevel(2);
                sandwich.getMeat().increaseCookingLevel(2);
                break;
            case HIGH:
                sandwich.getBread().increaseCookingLevel(3);
                sandwich.getMeat().increaseCookingLevel(3);
                break;
        }


    }
}
