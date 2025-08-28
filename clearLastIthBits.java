public class clearLastIthBits {
    public static int clearIthBit(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(15, 2));
    }
}
