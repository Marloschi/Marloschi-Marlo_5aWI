public class BubbleSort {
    public static void main(String[] args) {
        int[] x = RandomNumber.generateDataArray(10);
        int[] SortedArray = BubbleSort(x);


        for (int i = 0; i < SortedArray.length; i++) {
            System.out.println(SortedArray[i]);
        }
    }

    public static int[] BubbleSort(int[] sorted) {
        boolean SwapBubbles = true;
        while (SwapBubbles) {
            SwapBubbles = false;
            for (int i = 0; i < sorted.length - 1; i++) {

                if (sorted[i] > sorted[i + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    SwapBubbles = true;

                }

            }

        }
        return sorted;
    }
}
