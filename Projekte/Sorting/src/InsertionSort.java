public class InsertionSort {

    public static void main(String[] args) {
        int[] x = RandomNumber.generateDataArray(10);
        int[] SortedArray = InsertionSort(x);


        for (int i = 0; i < SortedArray.length; i++) {
            System.out.println(SortedArray[i]);
        }

    }

    public static int[] InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int ValueToSort = array[i];
            int k = i;
            while (k > 0 && array[k - 1] > ValueToSort) {
                array[k] = array[k-1];
                k--;

            }
            array[k] = ValueToSort;
        }

        return array;
    }
}
