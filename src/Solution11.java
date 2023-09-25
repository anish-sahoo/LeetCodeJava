public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, area = 0;
        while(left < right){
            area = Math.max(Math.min(height[left], height[right])*(right-left), area);
            if(height[left] < height[right]){
                int maxLeft = height[left];
                while (left < right && height[left] <= maxLeft) {
                    left++;
                }
            }
            else {
                int maxRight = height[right];
                while (left < right && height[right] <= maxRight) {
                    right--;
                }
            }
        }
        return area;
    }
}
