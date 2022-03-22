/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
        public int findInMountainArray(int target, MountainArray mountainArr) {

        int l = 0;
        int r = mountainArr.length() - 1;
        int mid;
        int peak = 0;

        while (l < r) {
            mid = (l + r) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                l = peak = mid + 1;
            } else {
                r = mid;
            }
        }

        // find target in the left of peak
        l = 0;
        r = peak;
        while (l <= r) {
            mid = (l + r) / 2;
            int val = mountainArr.get(mid);
            if (val < target) {
                l = mid + 1;
            } else if (val > target) {
                r = mid - 1;
            } else
                return mid;

        }
        

        // find target in the right of peak
        l = peak;
        r = mountainArr.length() - 1;
        while (l <=r) {
            mid = (l + r) / 2;
            int val = mountainArr.get(mid);
            if (val < target) {
                r = mid - 1;
            } else if (val > target) {
                l = mid + 1;
            } else
                return mid;
        }

            return -1;
    }
}