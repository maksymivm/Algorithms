import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskNumber7Test {

    @Test
    public void TaskNumber7Algorithm(){

        String expectedResult = "Bad Number";
        //String str = "Good Number";
        //String str2 = "Bad Number";
        //String str3 = "Poor Number";
        //String str4 = "-1";

        TaskNumber7 TaskNumber7 = new TaskNumber7();
        String actualResult = TaskNumber7.TaskNumber7Algoritm(9); // vvodutu nomer dlya provirku tut!!!

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
