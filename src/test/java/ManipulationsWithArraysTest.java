import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {
    // 1. Positive path all numbers are positive.
    @Test
    public void testMultiplуArrayByNumberPositiveNumbers(){
        Integer[] numbers = {1, 2, 3, 4, 5};
        int n = 3;
        Integer[] expectedResult = {3, 6, 9, 12, 15};
        Integer[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 2. Positive path all numbers are negative.
    @Test
    public void testMultiplуArrayByNumberNegativeNumbers(){
        Integer[] numbers = {-1, -2, -3, -4, -5};
        int n = -3;
        Integer[] expectedResult = {3, 6, 9, 12, 15};
        Integer[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 3. Positive path all numbers are negative.
    @Test
    public void testMultiplyArrayByNumberNegativeAndPositiveNumbers(){
        Integer[] numbers = {-1, -2, -3, -4, -5};
        int n = 3;
        Integer[] expectedResult = {-3, -6, -9, -12, -15};
        Integer[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 4. Negative path array if numbers is empty.
    @Test
    public void testNegativeMultiplyArrayIsEmpty(){
        Integer[] numbers = {};
        int n = 3;
        Integer[] expectedResult = {};
        Integer[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 1.2. Positive path all numbers are positive.
    @Test
    public void testToDoubleArrayPositiveNumbers(){
        Integer[] numbers = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 2.2. Positive path all numbers are negative.
    @Test
    public void testToDoubleArrayNegativeNumbers(){
        Integer[] numbers = {-1, -2, -3, -4, -5};
        double[] expectedResult = {-1.0, -2.0, -3.0, -4.0, -5.0};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 3.2. Negative path array if numbers is empty.
    @Test
    public void testToDoubleArrayArrayIsEmpty(){
        Integer[] numbers = {};
        double[] expectedResult = {};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 1.3. Positive path all numbers are positive.
    @Test
    public void testToIntArrayPositiveNumbers(){
        double[] numbers = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 2.3. Positive path all numbers are negative.
    @Test
    public void testToIntArrayNegativeNumbers(){
        double[] numbers = {-1.1, -2.5, 3.7, -4.0, 5.5};
        int[] expectedResult = {-1, -2, 3, -4, 5};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 3.3. Negative path array if numbers is empty.
    @Test
    public void testToIntArrayIsEmpty(){
        double[] numbers = {};
        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 1.4. Positive path all numbers are negative.
    @Test
    public void testIntToStringArrayNegativeAndPositiveNumbers(){
        int[] numbers = {-1, -2, 3, -4, 5};
        String [] expectedResult = {"-1","-2", "3","-4","5"};
        String [] actualResult = new ManipulationsWithArrays().intToStringArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 2.4. Negative path array if numbers is empty.
    @Test
    public void testIntToStringArrayIsEmpty(){
        int[] numbers = {};
        String [] expectedResult = {};
        String [] actualResult = new ManipulationsWithArrays().intToStringArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 1.5. Positive path all numbers are negative.
    @Test
    public void testDoubleToStringArrayNegativeAndPositiveNumbers(){
        double[] numbers = {-1.1, 2.5, 3.7, -4.0, 5.5};
        String [] expectedResult = {"-1.1","2.5", "3.7","-4.0","5.5"};
        String [] actualResult = new ManipulationsWithArrays().doubleToStringArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 2.4. Negative path array if numbers is empty.
    @Test
    public void testDoubleToStringArrayIsEmpty(){
        double[] numbers = {};
        String [] expectedResult = {};
        String [] actualResult = new ManipulationsWithArrays().doubleToStringArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }




}
