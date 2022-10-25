import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

//  1. Positive path positive numbers
    @Test
    public void testPositivePathPositiveNumbers(){
        int n1 = 3333;
        int n2 = 9999;
        int expectedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //  2. Positive path negative numbers
    @Test
    public void testPositivePathNegativeNumbers(){
        int n1 = -3333;
        int n2 = -9999;
        int expectedResult = -3333;
        int actualResult = new BiggerValue().biggerValue(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //  3. Positive path negative and positive numbers
    @Test
    public void testPositivePathNegativeAndpositiveNumbers(){
        int n1 = 3333;
        int n2 = -9999;
        int expectedResult = 3333;
        int actualResult = new BiggerValue().biggerValue(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //  4. Positive path  numbers are equal
    @Test
    public void testPositiveNumbersAreEqual(){
        int n1 = 3333;
        int n2 = 3333;
        int expectedResult = 3333;
        int actualResult = new BiggerValue().biggerValue(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }

}
