package pl.pjatk.tdd.strings;

import java.util.ArrayList;

public class StringUtils {

    public static int numSum(String strNum) {

        int num=Integer.parseInt(strNum);
        ArrayList<Integer> array = new ArrayList<Integer>();
        int result = 0;
        do{
            array.add(0, num %10);
            num /= 10;
        } while  (num > 0);

        for(int i=0;i<array.size();i++){

            result+= array.get(i);
        }



        return result;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }


        return true;
    }
}


