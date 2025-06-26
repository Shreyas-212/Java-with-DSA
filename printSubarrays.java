public class printSubarrays {
    public static void printSubarrays(int numbers[]) {
        int sa = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
                sa++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + sa);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}