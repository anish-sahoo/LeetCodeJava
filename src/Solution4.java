class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0,j = 0, k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }
            else merged[k++] = nums2[j++];
        }

        while(i<nums1.length || j<nums2.length){
            if( i >= nums1.length){
                merged[k++] = nums2[j++];
            }
            else {
                merged[k++] = nums1[i++];
            }
        }
        if(merged.length %2 == 0){
            return (merged[merged.length/2] + merged[merged.length/2 - 1]) / 2.0;
        }
        return merged[merged.length/2];
    }
}

// runtime = 2ms, beats 94.23% of java users
// memory = 44.1 mb, beats 99.56% of java users