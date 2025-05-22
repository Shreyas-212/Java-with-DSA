public class hollowRectangle {
    public static void hollow_Rectangle(int totRows, int totCol) {
        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totCol; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_Rectangle(4, 5);
    }
}
