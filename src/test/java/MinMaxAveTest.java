import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MinMaxAveTest {

    @Test
    public void MinMaxAlgotithm(){

        int[] expectedResult = {3, 7, 5};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;

        MinMaxAve MinMaxAve = new MinMaxAve();
        int[] actualResult = MinMaxAve.MinMaxAveAlgorithm(array, a, b);


        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
