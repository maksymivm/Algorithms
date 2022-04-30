public class SumArray {

    public int SumArrayAlgoritm(int[] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum;
    }
}
