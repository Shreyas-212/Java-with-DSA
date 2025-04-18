public class ifElse {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("adult: vote, drive");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("not adult");
        }
    }
}