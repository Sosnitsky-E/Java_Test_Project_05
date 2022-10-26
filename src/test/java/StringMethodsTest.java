import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

//    1.1 positive path with a spaces in beginning and in the end of a String.
    @Test
    public void testRemoveSpaces_SpacesPresent(){
        String str = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    1.2. positive path  paces ate absent in to the String.
    @Test
    public void testRemoveSpaces_SpacesAbsent(){
        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //    1.3. negative  the String is empty.
    @Test
    public void testNegativeRemoveSpaces_StringEmpty(){
        String str = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
//    2.1 positive test with spaces
    @Test
    public void testRemoveAllAsSApaces(){
        String str = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //    2.2 positive test with letter "a"and space
    @Test
    public void testRemoveAllAsSpaceLetterA(){
        String str = "panda   ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //    2.3 positive test with letter "a"
    @Test
    public void testRemoveAllAsLetterA(){
        String str = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult,expectedResult);

    }
    //    2.4 negative test with letter "a"
    @Test
    public void testNegativeRemoveAllAsStringEmpty(){
        String str = "";
        String expectedResult = "The row is empty";
        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult,expectedResult);

    }

//    3.1 positive path String of numbers
    @Test
    public  void testRemoveAllZerosAllNumbers(){
        String s = "3504209706040000";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(s);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    3.2 positive path String of numbers with spaces
    @Test
    public  void testRemoveAllZerosAllNumbersWithSpaces(){
        String s = " 3504209 706040000 ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(s);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    3.3 negative path String of numbers with spaces and letters
    @Test
    public  void testNegativeRemoveAllZerosAllNumbersWithLetters(){
        String s = "45 34f";
        String expectedResult = "The row contents a letters or hasn't a numbers";
        String actualResult = new StringMethods().removeAllZeros(s);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    3.4 negative path String  content one space
    @Test
    public  void testNegativeRemoveAllZerosSpace(){
        String s = " ";
        String expectedResult = "The row contents a letters or hasn't a numbers";
        String actualResult = new StringMethods().removeAllZeros(s);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //    3.5 negative path String  content one space
    @Test
    public  void testNegativeRemoveAllZerosEmpty(){
        String s = "";
        String expectedResult = "The row is empty";
        String actualResult = new StringMethods().removeAllZeros(s);
        Assert.assertEquals(actualResult,expectedResult);
    }


}
