import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

//    1. Positive path
    @Test
    public void testCountEvenValuesInArray(){
        int[] numbers = {22,45,18,79,3,5,0};
        int expectedResult = 3;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    2. Positive path length 1 with even number;
    @Test
    public void testCountEvenValuesInArrayLengthEven(){
        int[] numbers = {22};
        int expectedResult = 1;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    3. Positive path length 1 with odd number;
    @Test
    public void testCountEvenValuesInArrayLengthOdd(){
        int[] numbers = {21};
        int expectedResult = 0;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    4. Negative path array is empty
    @Test
    public void testCountEvenValuesInArrayEmpty(){
        int[] numbers = {};
        int expectedResult = 0;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    1.2. Positive path
    @Test
    public void testCountOddValuesInArray(){
        int[] numbers = {22,45,18,79,3,5,0};
        int expectedResult = 4;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    2.2. Positive path length 1 with even number;
    @Test
    public void testCountOddValuesInArrayLengthEven(){
        int[] numbers = {22};
        int expectedResult = 0;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    3.2. Positive path length 1 with odd number;
    @Test
    public void testCountOddValuesInArrayLengthOdd(){
        int[] numbers = {21};
        int expectedResult = 1;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    4.2. Negative path array is empty
    @Test
    public void testCountOddValuesInArrayEmpty(){
        int[] numbers = {};
        int expectedResult = 0;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }

//    1.3. Positive path all numbers positive and  greater than n
    @Test
    public void testValuesPositiveGreaterThanNumber(){
        int[] numbers = {22,45,18,79,3,5,10};
        int n = 2;
        boolean expectedResult = true;
        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    2.3. Positive path all numbers positive and  greater than n
    @Test
    public void testValuesNegativeGreaterThanNumber(){
        int[] numbers = {-22,-45,-18,-79,-3,-5,-10};
        int n = -129;
        boolean expectedResult = true;
        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    3.3. Negative path - one of the number equals to n;
    @Test
    public void testNegativeOneOfValueEqualNumber(){
        int[] numbers = {22,45,18,79,3,5,10};
        int n = 3;
        boolean expectedResult = false;
        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //    4.3. Negative path - array is empty;
    @Test
    public void testNegativeArrayIsEmpty(){
        int[] numbers = {};
        int n = 3;
        boolean expectedResult = false;
        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(numbers,n);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
