public class ternaryOperator {
    public static void main(String[] args) {
        int number = 3;

        //ternary operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
