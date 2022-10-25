import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {
    // 1. Positive path - array length greater "0"
    // array content only positive numbers
    @Test
    public void testPositiveArrayPositiveNumbers() {
        Integer[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // 2. Positive path - array length greater "0"
    // array content only negative numbers
    @Test
    public void testPositiveArrayNegativeNumbers() {
        Integer[] array = {-7,-3};
        int expectedResult = -10;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // 3. Positive path - array length greater "0"
    // array content positive and negative numbers
    @Test
    public void testPositiveArrayPositiveAndNegativeNumbers() {
        Integer[] array = {-7,2,-3,10};
        int expectedResult = 2;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // 4. Negative path - array length greater "0"
    // array content null.
    @Test
    public void testNegativeArrayContainsNull() {
        Integer[] array = {-7,2,-3,null,10};
        int expectedResult = 2;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // 5. Negative path - array length is "0"

    @Test
    public void testNegativeArrayIsEmpty() {
        Integer[] array = {};
        int expectedResult = 0;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
