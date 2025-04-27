import java.util.Scanner;

public class practiceProblem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
