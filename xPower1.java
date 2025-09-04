public class xPower1 {
    public static int optimisedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;      //x^n = x^n/2 * x^n/2

        //n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimisedPower(2, 10));
        System.out.println(optimisedPower(2, 5));
    }
}
