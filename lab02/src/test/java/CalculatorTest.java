import org.junit.Test;
import static org.junit.Assert.*;
import pl.pjatk.unit_tests.Calculator;

public class CalculatorTest {
    Calculator calc = new Calculator();


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
        assertTrue(Calculator.isDivisible(4, 2));
    }

    @Test
    public void divisionByFalse(){
        assertFalse(Calculator.isDivisible(4, 3));
    }

    @Test
    public void gcd6(){
        assertEquals(6, Calculator.greatestCommonDivisor(12,18));
    }

    @Test
    public void gcd7(){
        assertEquals(7, Calculator.greatestCommonDivisor(14,21));
    }




    @Test
    public void mul1(){
    assertEquals(6, calc.multiply(2,3));
    }

    @Test
    public void mul2(){
        assertEquals(4, calc.multiply(2,2));
    }

    @Test
    public void mul3(){
        assertEquals(-1, calc.multiply(-1,1));
    }

    @Test
    public void mul4(){
        assertEquals(16, calc.multiply(-4,-4));

    }
}
