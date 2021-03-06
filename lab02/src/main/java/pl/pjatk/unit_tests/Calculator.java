package pl.pjatk.unit_tests;

public class Calculator {



    public int multiply(int x, int y) {
        if (y == 0) {
            return 0;
        }
        if (y > 0) {
            return (x + multiply(x, y - 1));
        }

        if (y < 0) {
            return -multiply(x, -y);
        }
        return -1;
    }

    public static int power(int base, int exponent){

        int result = 1;
        if(exponent == 0){
            return 1;
        }
        else if(exponent>0){
            while (exponent != 0) {
                result *= base;
                --exponent;
            }
            return result;
        }

        return 0;
    }

    public static boolean isDivisible(int x, int y){
        return x % y == 0;
    }

    public static int greatestCommonDivisor(int x, int y) {
        int result = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                result = i;
            }
        }
        return result;
    }
}



