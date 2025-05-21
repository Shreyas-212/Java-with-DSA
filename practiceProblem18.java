import java.util.Scanner;

public class practiceProblem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an Integer: ");
        int digits = sc.nextInt();
        System.out.println("The Sum is " + sumDigits(digits));
    }

    public static int sumDigits(int num) {
        int sumOfDigits = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            sumOfDigits += lastDigit;
            num /= 10;
        }
        return sumOfDigits;
    }
}
