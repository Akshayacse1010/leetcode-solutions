public class Solution {
    public boolean search(int[] nums, int target) {
        if (nums[0] == target || nums[nums.length - 1] == target) {
            return true;
        }

        int n = nums.length;
        int l = 0;
        int h = n - 1;
        while (l + 1 < n && nums[l] == nums[l + 1]) {
            l++;
        }

        if (l == n - 1) {
            return nums[0] == target;
        }

        while (h >= 0 && nums[h] == nums[0]) {
            h--;
        }

        int start = l;
        int end = h;

        int pivot = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] >= nums[0]) {
                l = mid + 1;
            } else {
                pivot = mid;
                h = mid - 1;
            }
        }

        if (pivot == -1) {
            l = start;
            h = end;
        } else {
            if (target > nums[end]) {
                l = start;
                h = pivot - 1;
            } else {
                l = pivot;
                h = end;
            }
        }

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > target) {
                h = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
