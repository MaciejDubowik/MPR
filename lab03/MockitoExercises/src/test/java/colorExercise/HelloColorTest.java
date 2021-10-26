package colorExercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelloColorTest {

    @Mock
    ColorPicker colorPicker;

    @InjectMocks
    HelloColor helloColor;

    @Test
    public void helloColorTest() {
        when(colorPicker.getColor()).thenReturn("blue");
        String msg = helloColor.hello();
        assertEquals("Hello BLUE!", msg);
    }
}
