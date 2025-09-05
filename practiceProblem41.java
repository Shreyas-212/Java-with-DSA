public class practiceProblem41 {
    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Length of string = " + length(str));
    }
}