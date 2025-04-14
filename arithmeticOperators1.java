// Unary Operators

public class arithmeticOperators1 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;   //pre
        System.out.println(a);
        System.out.println(b);


        int c = 10;
        int d = c++;     //post
        System.out.println(c);
        System.out.println(d);
    }
}
