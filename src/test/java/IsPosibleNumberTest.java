import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPosibleNumberTest {

    @Order(1)
    @Test
    public void IsposibleTestHappyPath(){

        int number = 555;
        boolean expectedResult = true;

        IsPosibleNumber IsPosibleNumber = new IsPosibleNumber();
        Boolean actualResult = IsPosibleNumber.IsPosibleNumberAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void IsposibleTestHappyPathNegativeNumber(){

        int number = -555;
        boolean expectedResult = false;

        IsPosibleNumber IsPosibleNumber = new IsPosibleNumber();
        Boolean actualResult = IsPosibleNumber.IsPosibleNumberAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
