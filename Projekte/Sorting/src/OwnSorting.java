public class OwnSorting {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] x = RandomNumber.generateDataArray(10);
        boolean didSwap = true;
        while(didSwap){
            didSwap = false;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] < x[i + 1]) {
                    continue;
                } else {
                    int temp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = temp;
                    didSwap = true;
                }
            }
        }

        for (int i = 0; i < x.length-1; i++) {
            System.out.println(x[i]);

        }


    }

}









