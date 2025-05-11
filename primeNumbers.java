// import java.util.Scanner;

// public class primeNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number:");
//         int n = sc.nextInt();

//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++) {
//             if(n % i == 0) {
//                 isPrime = false;
//             }
//         }

//         if(isPrime == true) {
//             System.out.println("It is prime number.");
//         } else {
//             System.out.println("It is not a prime number");
//         }
//     }
// }

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime == true) {
            System.out.println("It is prime number.");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
