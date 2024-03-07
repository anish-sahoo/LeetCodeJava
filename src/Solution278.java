public class Solution278 {
    public int firstBadVersion(int n) {
        int left = 0, right = n, mid = -1;
        while(left < right) {
            mid = left + (right - left)/2;
            if(isBadVersion(mid)) {
                right = mid;
            }
            else left = mid + 1;
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}

// https://leetcode.com/problems/first-bad-version/