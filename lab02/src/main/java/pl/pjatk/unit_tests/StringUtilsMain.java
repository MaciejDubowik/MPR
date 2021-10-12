package pl.pjatk.unit_tests;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsMain {
    public static String toUpperCase(String str){
        return StringUtils.upperCase(str);
    }

    public static String reverseString(String str){
        return StringUtils.reverse(str);
    }

    public static String multiplyString(String str, int value){
        return StringUtils.repeat(str,value);
    }

    public static String removeSmallChars(String str){
        String regex = "[a-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");

    }

    public static String removeBigChars(String str){
        String regex = "[A-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");

    }

    public static String removeAllButLetters(String str){
        String regex = "[^A-Za-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }

}
