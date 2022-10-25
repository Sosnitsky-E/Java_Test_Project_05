import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    //1. positive number - even
    @Test
    public void testPositiveEvenNumber(){
          //AAA
           //arrange
       int number = 222222;
        String  expectedResult = "Even";
      //actual
     String  actualResult = new OddEven().oddEven(number);
     //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }
    //2. positive number - odd
    @Test
    public void testPositiveOddNumber(){
        //AAA
        //arrange
        int number = 345;
        String  expectedResult = "Odd";
        //actual
        String  actualResult = new OddEven().oddEven(number);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }
    //3.  number "0" - odd
    @Test
    public void testZeroEvenNumber(){
        //AAA
        //arrange
        int number = 0;
        String  expectedResult = "Even";
        //actual
        String  actualResult = new OddEven().oddEven(number);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }
    //4.  negative number  - even
    @Test
    public void testNegativeEvenNumber(){
        //AAA
        //arrange
        int number = -222222;
        String  expectedResult = "Even";
        //actual
        String  actualResult = new OddEven().oddEven(number);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }
    //5.  negative number  - odd
    @Test
    public void testNegativeOddNumber(){
        //AAA
        //arrange
        int number = -345;
        String  expectedResult = "Odd";
        //actual
        String  actualResult = new OddEven().oddEven(number);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }
}
