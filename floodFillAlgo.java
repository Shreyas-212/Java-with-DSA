import java.util.Arrays;

public class floodFillAlgo {

    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length
                || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        helper(image, sr, sc - 1, color, vis, orgCol);
        helper(image, sr, sc + 1, color, vis, orgCol);
        helper(image, sr - 1, sc, color, vis, orgCol);
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        floodFillAlgo obj = new floodFillAlgo();

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int newColor = 2;

        int[][] result = obj.floodFill(image, sr, sc, newColor);

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}