import org.junit.Test;
import static org.junit.Assert.*;
import pl.pjatk.unit_tests.Calculator;

public class CalculatorTest {
    @Test
    public void twoPowThree(){
        assertEquals(8,Calculator.power(2,3));
    }

    @Test
    public void zeroPow(){
        assertEquals(1,Calculator.power(12,0));
    }

    @Test
    public void isDivisibleTrue(){
        assertEquals(true, Calculator.isDivisible(4,2));
    }

    @Test
    public void divisionByFalse(){
        assertEquals(false, Calculator.isDivisible(4,3));
    }

    @Test
    public void gcd6(){
        assertEquals(6,Calculator.greatestCommonDivisor(12,18));
    }

    @Test
    public void gcd7(){
        assertEquals(7,Calculator.greatestCommonDivisor(14,21));
    }

}
