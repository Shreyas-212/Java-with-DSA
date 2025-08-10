public class evenOddbit {
    public static void oddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(11);
        oddEven(14);
    }
}
