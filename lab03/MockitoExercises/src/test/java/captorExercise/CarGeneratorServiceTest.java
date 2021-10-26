package captorExercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CarGeneratorServiceTest {

    @Mock
    ICarGenerator carGenerator;

    @Captor
    ArgumentCaptor<Car> carArgumentCaptor;

    @InjectMocks
    CarGeneratorService carGeneratorService;

    @Test
    public void generateCarTest() {
        carGeneratorService.generateCar("mercedes", "red");
        Mockito.verify(carGenerator).generateCar(carArgumentCaptor.capture());

        assertEquals("mercedes", carArgumentCaptor.getValue().getMake());
        assertEquals("red", carArgumentCaptor.getValue().getColour());
    }

}
