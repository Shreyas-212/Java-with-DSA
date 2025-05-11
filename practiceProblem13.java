import java.util.Scanner;

public class practiceProblem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.println("Enter positive integer: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
