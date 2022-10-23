import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //1. positive array length even number
    @Test
    public void testPositiveArrayLengthIsEven(){
        //AAA
        //arrange
        Integer[] array = {-45, 590, 234, 985, 12, 68};
        Integer[]  expectedResult = {590, 985, 68};
        //actual
        Integer[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //2. Positive array length odd umber
    @Test
    public void testPositiveArrayLengthIsOdd(){
        Integer[] array = {-45, 9 , 590, 234, 985, 12, 68};
        Integer[]  expectedResult = {9, 234, 12};
        //actual
        Integer[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //3. Positive array length equals 2
    @Test
    public void testPositiveArrayLengthEqualsTwo(){
        Integer[] array = {-45, 9 };
        Integer[]  expectedResult = {9};
        //actual
        Integer[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //4. Negative array length less  than 2
    @Test
    public void testNegativeArrayLengthLessThanTwo(){
        Integer[] array = {-45 };
        Integer[]  expectedResult = {};
        //actual
        Integer[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //5. Negative array empty
    @Test
    public void testNegativeArrayEmpty(){
        Integer[] array = {};
        Integer[]  expectedResult = {};
        //actual
        Integer[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
