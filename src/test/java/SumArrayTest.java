import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SumArrayTest {

    SumArray SumArray = new SumArray();

    @Test
    public void testSumArrayAlgoritm() {

        int expectedResult = 15;
        int[] array = new int[]{0, 1, 2, 3, 4, 5};

        int actualResult = SumArray.SumArrayAlgoritm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayAlgoritmWithNegativeNumbers() {

        int expectedResult = -10;
        int[] array = new int[]{-7, -3};

        int actualResult = SumArray.SumArrayAlgoritm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
