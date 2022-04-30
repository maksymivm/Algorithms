import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class OddIndicesTest {


    @Order(1)
    @Test
    public void testOddIndices() {

        // Arrange
        int[] array = new int[] {- 45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        // Act


        OddIndices Odd = new OddIndices();
        int[] actualResult = Odd.OddIndiciesAlgoritm(array);

        // Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}


