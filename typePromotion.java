public class typePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b-a);     // Converted to int in expressions by default
    }
}
