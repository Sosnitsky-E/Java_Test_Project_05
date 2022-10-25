import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
//    1.Positive path return array integer numbers
    @Test
        public void testCreateIntArray(){
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        Integer[] expectedResult = {1, 2, 3, 4, 5};
        Integer[] actualResult = new CreateArray().createIntArray(n1,n2,n3,n4,n5);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //    2.Positive path return array double numbers
    @Test
    public void testCreateDoubleArray(){
        double d1 = 1.1;
        double d2 = 2.5;
        double d3 = 3.7;
        double d4 = 4.0;
        double d5 = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};
        double[] actualResult = new CreateArray().createDoubleArray(d1,d2,d3,d4,d5);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //    3.Positive path return array Strings;
    @Test
    public void testCreateStringArray(){
        String s1 ="It";
        String s2 = "was";
        String s3 = "an";
        String s4 = "apple";
        String s5 = "pie";
        String[] expectedResult = {"It","was","an","apple","pie"};
        String[] actualResult = new CreateArray().createStringArray(s1,s2,s3,s4,s5);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 4.1 positive path multi-word sentence
    @Test
    public void testMultiWordSentence(){
        String str = "It was an apple pie";
        String []expectedResult = {"It","was","an","apple","pie"};
        String[] actualResult = new CreateArray().createArrayFromText(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 4.2 positive path  one-word sentence without spaces
    @Test
    public void testOneWordSentence(){
        String str = "apple";
        String []expectedResult = {"apple"};
        String[] actualResult = new CreateArray().createArrayFromText(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 4.2 positive path  one-word sentence wit  space at the beginning
    @Test
    public void testOneWordSentenceWithSpaceAtBeginning(){
        String str = " apple";
        String []expectedResult = {"apple"};
        String[] actualResult = new CreateArray().createArrayFromText(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 4.3 positive path  one-word sentence wit space at the end
    @Test
    public void testOneWordSentenceWithSpaceAtEnd(){
        String str = "apple";
        String []expectedResult = {"apple"};
        String[] actualResult = new CreateArray().createArrayFromText(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 4.3 positive path  one-word sentence wit space at the beginning and at the end
    @Test
    public void testOneWordSentenceWithSpaceBeginningEnd(){
        String str = " apple ";
        String []expectedResult = {"apple"};
        String[] actualResult = new CreateArray().createArrayFromText(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // 4.5 Negative String is empty.
    @Test
    public void testStringIsEmpty_Negative(){
        String str = "";
        String []expectedResult = {};
        String[] actualResult = new CreateArray().createArrayFromText(str);
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 4.6 Negative String consists of one space
    @Test
    public void testStringOneSpace_Negative(){
        String str = " ";
        String []expectedResult = {};
        String[] actualResult = new CreateArray().createArrayFromText(str);
        Assert.assertEquals(actualResult,expectedResult);
    }



}
