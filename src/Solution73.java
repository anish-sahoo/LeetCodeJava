import java.util.ArrayList;
import java.util.Arrays;

public class Solution73 {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> points = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    points.add(new int[]{i,j});
                }
            }
        }
        for(int[] point: points){
            update(matrix, point[0], point[1]);
        }
    }

    public void update(int[][] matrix, int row, int col){
        for(int a=0; a<matrix[0].length; a++){
            matrix[row][a] = 0;
        }
        for(int b=0; b<matrix.length; b++){
            matrix[b][col] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] answer = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        for(int[] a: answer){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("\n\n");
        new Solution73().setZeroes(answer);
        for(int[] a: answer){
            System.out.println(Arrays.toString(a));
        }
    }
}
