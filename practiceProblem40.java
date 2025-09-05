public class practiceProblem40 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int n) {
        if(n == 0) {
            return;
        }

        int lastDigit = n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit] + " ");;
    }
    public static void main(String[] args) {
        int n = 2010;
        printDigits(n);
    }
}
