import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    //  1. Positive path positive numbers
    @Test
    public void testPositivePathPositiveNumbers(){
        int n1 = 90;
        int n2 = 89;
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //  2. Positive path negative numbers
    @Test
    public void testPositivePathNegativeNumbers(){
        int n1 = -89;
        int n2 = -90;
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //  3. Positive path negative and positive numbers
    @Test
    public void testPositivePathNegativeAndPositiveNumbers(){
        int n1 = -89;
        int n2 = 89;
        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //  4. Positive path  numbers are equal
    @Test
    public void testPositiveNumbersAreEqual(){
        int n1 = 89;
        int n2 = 89;
        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(n1,n2);
        Assert.assertEquals(actualResult,expectedResult);

    }

}
