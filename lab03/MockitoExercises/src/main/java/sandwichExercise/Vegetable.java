package sandwichExercise;

import sandwichExercise.enums.VegetableEnum;

public class Vegetable {

    VegetableEnum type;

    public Vegetable(VegetableEnum type) {
        this.type = type;
    }

    public VegetableEnum getType() {
        return type;
    }

    public void setType(VegetableEnum type) {
        this.type = type;
    }
}
