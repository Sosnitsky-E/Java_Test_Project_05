import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    //1. The number is  greater than 0.
    @Test
    public void testNumberGreaterThanZero(){
        int n = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(n);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //2. The number is  less than 0.
    @Test
    public void testNumberLessThanZero(){
        int n = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(n);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //3. The number is  equal than 0.
    @Test
    public void testNumberEqualsZero(){
        int n = 0;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(n);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
