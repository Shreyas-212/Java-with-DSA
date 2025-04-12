import java.util.Scanner;        //Average Calculation of 3 numbers.

public class practiceProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum/3;
        System.out.println(avg);
    }
}