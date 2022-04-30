import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    //OddEven OddEven = new OddEven();

    @Order(1)
    @Test
    public void testOddEvenHappyPath(){

        // Arrange
        //
        int number = -345;
        String expectedResult = "Odd";

        // Act
        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(number);

        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testOddEvenHappyPath2(){

        // Arrange
        //
        int number = 0;
        String expectedResult = "Even" ;

        // Act
        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(number);

        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPath3(){

        // Arrange
        //
        int number = 222222;
        String expectedResult = "Even" ;

        // Act
        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(number);

        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPath4(){

        // Arrange
        //
        long number = 2147483648L + 1;
        String expectedResult = "Undefined" ;

        // Act
        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(number);

        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

}


