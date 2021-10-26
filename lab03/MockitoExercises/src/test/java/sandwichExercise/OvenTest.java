package sandwichExercise;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import sandwichExercise.enums.BreadEnum;
import sandwichExercise.enums.CookingEnum;
import sandwichExercise.enums.MeatEnum;

@RunWith(MockitoJUnitRunner.class)
public class OvenTest {

    @InjectMocks
    Sandwich sandwich;

    @Mock
    Meat meat;

    @Mock
    Vegetable vegetable;

    @Mock
    Bread bread;

    @Test
    public void cookTest() {
        Oven oven = new Oven();
        oven.cook(sandwich, CookingEnum.MID);

        assertEquals(2, sandwich.ge)
    }
}
