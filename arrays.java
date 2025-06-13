import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int marks[] = new int[10];  

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("0: " + marks[0]);
        System.out.println("1: " + marks[1]);
        System.out.println("2: " + marks[2]);
    }
}