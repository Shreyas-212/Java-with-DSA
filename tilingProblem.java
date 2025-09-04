/*Given a "2 x n" board and tiles of size "2 x 1", the task is to count the number of ways to tile the given board using the 2 x 1 tiles. 
A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile. */
public class tilingProblem {
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
