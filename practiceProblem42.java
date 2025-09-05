public class practiceProblem42 {
    // Recursive function to count substrings
    static int countSubstrs(String str, int i, int j, int n) {
        // base cases
        if (n == 1) {
            return 1;
        }  
        if (n <= 0) {
            return 0;
        }  

        // count by excluding first char, excluding last char, and correcting overlap
        int res = countSubstrs(str, i+1, j, n-1)
                + countSubstrs(str, i, j-1, n-1)
                - countSubstrs(str, i+1, j-1, n-2);

        // if both ends match → add 1
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String s1 = "abcab";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + countSubstrs(s1, 0, s1.length()-1, s1.length())); // 7

        String s2 = "aba";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + countSubstrs(s2, 0, s2.length()-1, s2.length())); // 4
    }
}