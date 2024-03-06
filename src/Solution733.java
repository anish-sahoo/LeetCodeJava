public class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    private void fill(int[][] image, int row, int col, int color, int originalColor) {
        if(row < 0 || col < 0 || row >= image.length || col >= image[0].length) {
            return;
        }
        if(image[row][col] == color) {
            return;
        }
        if(image[row][col] != originalColor){
            return;
        }
        if(image[row][col] == originalColor){
            image[row][col] = color;
        }
        fill(image, row-1, col, color, originalColor);
        fill(image, row+1, col, color, originalColor);
        fill(image, row, col-1, color, originalColor);
        fill(image, row, col+1, color, originalColor);
    }
}

// https://leetcode.com/problems/flood-fill/description/
