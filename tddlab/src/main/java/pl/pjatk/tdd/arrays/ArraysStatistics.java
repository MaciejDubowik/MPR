package pl.pjatk.tdd.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysStatistics {
    public static int max(int[] numbers){
        int max = Arrays.stream(numbers).max().getAsInt();
        return max;
    }

    public static int min(int[] numbers){
        int min = Arrays.stream(numbers).min().getAsInt();
        return min;
    }

    public static double avg(int[] numbers){
        double sum = Arrays.stream(numbers).sum();
        double lengthDouble = numbers.length;
        double avg = sum/lengthDouble;
        return avg;
    }

    public static int sum(int[] numbers){
        int sum = Arrays.stream(numbers).sum();
        return sum;
    }
}
