import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Test
    @Order(1)
    public void BiggerValueAlgoritm(){

        int first = 9999;
        int second = 3333;
        int expectedResult = 9999;

        BiggerValue BiggerValue = new BiggerValue();
        int actualResult = BiggerValue.BiggerValueAlgoritm(first,second);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
