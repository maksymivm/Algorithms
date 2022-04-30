public class OddIndices {

    public int[] OddIndiciesAlgoritm(int[] array){


        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                    count++;
                }
            }

        int[] arr = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0) {
                arr[index] = array[i];
                index++;
            }
        }

        return arr;
    }
}
