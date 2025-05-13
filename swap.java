public class swap {                       
    public static void swap(int a, int b) {      // call by value makes a copy of variables
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
