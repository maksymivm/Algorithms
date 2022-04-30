public class MinMaxAve {

    public int[] MinMaxAveAlgorithm(int[] array, int a, int b) {

        int[] arr = new int[3];
        //int index = 0;

        int min = array[a];
        for (int i = array[a]; i < array[b]; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        arr[0] = min;

        int max = array[a];
        for (int i = array[a]; i < array[b]; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        arr[1] = max;

        int sum = 0;
        for (int i = array[a]; i < array[b]; i++) {
            sum += array[i];
        }
        arr[2] = sum / (array[b] - array[a] );

        return arr;
    }
}
