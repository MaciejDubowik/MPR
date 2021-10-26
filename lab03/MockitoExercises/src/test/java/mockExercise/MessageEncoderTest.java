package mockExercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MessageEncoderTest {

    @Mock
    Message message;

    @Test
    public void encodeTest() {
        MessageEncoder messageEncoder = new MessageEncoder();
        when(message.getMessage()).thenReturn("asd");
        messageEncoder.encode(message);
        String message2 = messageEncoder.encode(message);
        verify(message, times(2)).getMessage();
        assertEquals("ASD", message2);
    }
}
