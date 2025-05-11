import java.util.Scanner;

public class continueStatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            int num = sc.nextInt();

            if(num % 10 == 0) {
                continue;
            }

            System.out.println(num);

        } while(true);
    }
}
