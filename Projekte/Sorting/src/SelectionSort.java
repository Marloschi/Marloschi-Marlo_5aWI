public class SelectionSort {
    public static void main(String[] args) {

        int[] x = RandomNumber.generateDataArray(10);
        int[] SortedArray = SelectionSort(x);

        for (int i = 0; i < SortedArray.length; i++) {
            System.out.println(SortedArray[i]);
        }
    }

    public static int[] SelectionSort(int[] sorted) {
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        return sorted;
    }
}
