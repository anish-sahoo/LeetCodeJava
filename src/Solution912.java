// merge sort algorithm is the best for this
// Runtime - 26ms, Beats 79.42% of users with Java
// memory - 48.99mb, Beats 99.84% of users with Java

public class Solution912 {
    public int[] sortArray(int[] nums) {
        mergesort(nums);
        System.gc();
        return nums;
    }
    public void mergesort(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int lSize = arr.length/2;
        int rSize = arr.length - lSize;

        int[] lArr = new int[lSize];
        for (int i = 0; i < lSize; i++) {
            lArr[i] = arr[i];
        }
        int[] rArr = new int[rSize];
        for (int i = lSize; i < arr.length; i++) {
            rArr[i-lSize] = arr[i];
        }
        mergesort(lArr);
        mergesort(rArr);
        merge(arr, lArr, rArr);
    }
    int[] merge(int[] arr, int[] left, int[] right) {
        int lSize = left.length, rSize= right.length;
        int i = 0, j = 0, k = 0;
        while(i < lSize && j < rSize){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else arr[k++] = right[j++];
        }
        while (i < lSize){
            arr[k++] = left[i++];
        }
        while (j < rSize){
            arr[k++] = right[j++];
        }
        return arr;
    }

    //benchmark & test
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 1000; i++) {
            long start = System.nanoTime();
            int[] answer = new Solution912().sortArray(new int[]{7, 4, 1, 2, 5});
            long end = System.nanoTime();
            long elapsedTime = end - start;
            sum += elapsedTime;
            System.out.println("Elapsed time = " + elapsedTime );
        }
        System.out.println("Average Elapsed time = " + sum/1000.0 );
        System.out.println("Average Elapsed time in ms = " + sum/(1000.0 * 1000000.0));
    }
}
