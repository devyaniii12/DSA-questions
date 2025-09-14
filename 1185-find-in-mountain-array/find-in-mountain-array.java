class Solution {
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndex(mountainArr);

        // Search in ascending part
        int ans = binarySearch(target, 0, peak, mountainArr, true);
        if(ans != -1) return ans;

        // Search in descending part
        return binarySearch(target, peak + 1, mountainArr.length() - 1, mountainArr, false);
    }

    static int peakIndex(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int target, int start, int end, MountainArray mountainArr, boolean isAsc) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if(midVal == target) return mid;

            if(isAsc) {
                if(midVal < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if(midVal > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
