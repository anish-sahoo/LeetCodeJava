import java.util.Arrays;

public class Solution74 {
    // easier/more fun solution, 1ms, albeit theoretically slower & eats more memory
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     for(int[] row: matrix){
    //         if(Arrays.binarySearch(row, target) >= 0){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // 1 ms, less memory and theoretically better
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalCol = matrix[0].length-1;
        int left = 0, right = matrix.length-1, mid = 0;

        while(target >= matrix[left][0] && target <= matrix[right][totalCol]){
            mid = left + (right-left)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][totalCol]){
                break;
            }
            if(target < matrix[mid][0]){
                right = mid-1;
            }
            if(target > matrix[mid][totalCol]){
                left = mid + 1;
            }
        }
        return Arrays.binarySearch(matrix[mid], target) >= 0;
    }
}
