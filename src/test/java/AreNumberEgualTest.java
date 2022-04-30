import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumberEgualTest {

    @Test
    @Order(1)
    public void AreNumberAlgoritm(){

        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;

        AreNumberEgual AreNumberEqual = new AreNumberEgual();
        int actualResult = AreNumberEqual.AreNumberAlgoritm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

        @Test
        @Order(2)
        public void AreNumberAlgoritm2(){

            int num1 = -89;
            int num2 = 89;
            int expectedResult = -1;

            AreNumberEgual AreNumberEqual = new AreNumberEgual();
            int actualResult = AreNumberEqual.AreNumberAlgoritm(num1, num2);

            Assertions.assertEquals(expectedResult, actualResult);
        }

    @Test
    @Order(3)
    public void AreNumberAlgoritm3(){

        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;

        AreNumberEgual AreNumberEqual = new AreNumberEgual();
        int actualResult = AreNumberEqual.AreNumberAlgoritm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
