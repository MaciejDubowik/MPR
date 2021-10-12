
import org.junit.Test;
import pl.pjatk.unit_tests.StringUtilsMain;

import static org.junit.Assert.*;
public class StringUtilsTest {
    @Test
    public void toUpperCaseALA_MA_KOTA(){
        assertEquals("ALA MA KOTA", StringUtilsMain.toUpperCase("ala ma kota"));
    }
    @Test
    public void toUpperCaseALA_MA_PSA(){
        assertEquals("ALA MA PSA", StringUtilsMain.toUpperCase("ala ma psa"));
    }

    @Test
    public void strReverse1(){
        assertEquals("lubie programowac",StringUtilsMain.reverseString("cawomargorp eibul"));
    }

    @Test
    public void strReverse2(){
        assertEquals("kasztan",StringUtilsMain.reverseString("natzsak"));
    }

    @Test
    public void multiplyString3(){
        assertEquals("test test test ",StringUtilsMain.multiplyString("test ",3));
    }
    @Test
    public void multiplyString5(){
        assertEquals("ok ok ok ok ok ", StringUtilsMain.multiplyString("ok ",5));
    }

    @Test
    public void smallCharsRemove1(){
        assertEquals("J K", StringUtilsMain.removeSmallChars("Jan Kowalski"));
    }

    @Test
    public void smallCharsRemove2(){
        assertEquals("ASAP", StringUtilsMain.removeSmallChars("adsadassAjifsSffsafsafAjisfjsafaP"));
    }

    @Test
    public void bigCharsRemove1(){
        assertEquals("an owalski", StringUtilsMain.removeBigChars("Jan Kowalski"));
    }

    @Test
    public void bigCharsRemove2(){
        assertEquals("kawa jest pyszna", StringUtilsMain.removeBigChars("ALEkawa JESTjest Ppyszna"));
    }

    @Test
    public void removeAllWithoutLetters1(){
        assertEquals("Test", StringUtilsMain.removeAllButLetters("123Test!"));
    }

    @Test
    public void removeAllWithoutLetters2(){
        assertEquals("czesc", StringUtilsMain.removeAllButLetters("1233321321czesc!!!!1$$@$@$$"));
    }

}
