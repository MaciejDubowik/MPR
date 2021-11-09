package pl.pjatk.tdd.test.arrays;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;

public class ArraysStatisticsTest {
    @Test
    public void maximumShouldBePositiveNumber(){
        Assert.assertEquals(1, ArraysStatistics.max(new int[]{-10,-5,1,-2,-13}));
    }

    @Test
    public void maxValue10(){
        Assert.assertEquals(10, ArraysStatistics.max(new int[]{10,-34,1,-61,-52}));
    }


    @Test
    public void minValue61(){
        Assert.assertEquals(-61, ArraysStatistics.min(new int[]{10,-34,1,-61,-52}));
    }

    @Test
    public void minValue1(){
        Assert.assertEquals(1, ArraysStatistics.min(new int[]{10,2,1,61, 52}));
    }

    @Test
    public void sumValue10(){
        Assert.assertEquals(10, ArraysStatistics.sum(new int[]{1,2,7}));
    }

    @Test
    public void sumValue100(){
        Assert.assertEquals(100, ArraysStatistics.sum(new int[]{10,30,50,5,5}));
    }

    private static final double DELTA = 1e-15;

    @Test
    public void avgValue3(){
        Assert.assertEquals(3.0, ArraysStatistics.avg(new int[]{1,2,3,4,5}),DELTA);
    }

    @Test
    public void avgValue2_8() {
        Assert.assertEquals(2.8, ArraysStatistics.avg(new int[]{1, 2, 3, 4, 4}), DELTA);
    }


}
