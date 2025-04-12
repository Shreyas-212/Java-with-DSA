import java.util.Scanner;             // Cost of items

public class practiceProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of the pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of the pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter the cost of the eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("Total bill = ₹" + total);
    }
}