package pl.pjatk.tdd.test.strings;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;
import pl.pjatk.tdd.strings.StringUtils;

public class StringUtilsTest {
    @Test
    public void numbersSum10(){
        Assert.assertEquals(10, StringUtils.numSum("253"));
    }

    @Test
    public void numbersSum15(){
        Assert.assertEquals(15, StringUtils.numSum("2531211"));
    }

    @Test
    public void palindromeTrue(){
        Assert.assertEquals(true, StringUtils.isPalindrome("aga"));
    }

    @Test
    public void palindromeFalse(){
        Assert.assertEquals(false, StringUtils.isPalindrome("yyyyyyyProszeChceZdacJAZ"));
    }
}
