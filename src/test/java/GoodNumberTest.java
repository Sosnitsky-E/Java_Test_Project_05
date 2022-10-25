import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodNumberTest {
//    1.  M is multiple of 7 and 9
    @Test
    public void testNumberMultiple7And9(){
        int n = 63;
        String expectedResult = "Good Number";
        String  actualResult = new GoodNumber().goodNumber(n);
        Assert.assertEquals(actualResult,expectedResult);
    }
//    2. M is only multiple of 9 and not of 7
@Test
public void testNumberMultiple9(){
    int n = 9;
    String expectedResult = "Bad Number";
    String  actualResult = new GoodNumber().goodNumber(n);
    Assert.assertEquals(actualResult,expectedResult);
}
//    3. M is only multiple of 11
@Test
public void testNumberMultipleOnly11(){
    int n = 11;
    String expectedResult = "Poor Number";
    String  actualResult = new GoodNumber().goodNumber(n);
    Assert.assertEquals(actualResult,expectedResult);
}
//    4. M doesn't satisfy any of the above conditions
@Test
public void testNumberNotSatisfyConditionsAbov(){
    int n = 120;
    String expectedResult = "-1";
    String  actualResult = new GoodNumber().goodNumber(n);
    Assert.assertEquals(actualResult,expectedResult);
}
    //    5. M equals "0"
    @Test
    public void testNumberEqualsZero(){
        int n = 0;
        String expectedResult = "-1";
        String  actualResult = new GoodNumber().goodNumber(n);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
