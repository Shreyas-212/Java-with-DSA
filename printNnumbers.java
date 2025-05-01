import java.util.Scanner;

public class printNnumbers {
        public static void main(String[] args) {
            int counter = 1;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Numbers to print: ");
            int range = sc.nextInt();
            while (counter <= range) {
                System.out.print(counter + " ");
                counter++;
            }
        }
}
