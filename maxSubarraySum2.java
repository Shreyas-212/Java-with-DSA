public class maxSubarraySum2 {              // KADANE's algorithm
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 0) {
                allNegative = false;
            }
            maxNegative = Math.max(maxNegative, numbers[i]);

            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        if(allNegative) {
            System.out.println("All numbers are negative.");
            System.out.println("Our max subarray sum is: " + maxNegative);
        } else {
            System.out.println("Our max subarray sum is: " + ms);
        }
    }

    public static void main(String[] args) {
        int numbers1[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers1); 

        int numbers2[] = {-5, -2, -8, -1};
        kadanes(numbers2); 
    }
}