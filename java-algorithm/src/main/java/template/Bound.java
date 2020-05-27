package template;

/**
 * 二分：上下届
 * @author lishixiong
 * @version 1.0:Bound.java, v 0.1 2020-05-26 4:18 下午 Exp$
 */
public class Bound {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 2, 3, 4, 6, 6, 6, 13, 18 };
        System.out.println(lowerBound(nums, 6)); // 5
        System.out.println(upperBound(nums, 6)); // 7
        System.out.println(lowerBound(nums, 7)); // 8
        System.out.println(upperBound(nums, 7)); // 7
    }

    /*
     * nums[index] >= target, min(index)
     * target是给定数组的下限
     */
    public static int lowerBound(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int lb = -1, ub = nums.length;
        while (lb + 1 < ub) {
            int mid = lb + (ub - lb) / 2;
            if (nums[mid] < target) {
                lb = mid;
            } else {
                ub = mid;
            }
        }

        return lb + 1;
    }

    /*
     * nums[index] <= target, max(index)
     * target是给定数组的上限
     */
    public static int upperBound(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int lb = -1, ub = nums.length;
        while (lb + 1 < ub) {
            int mid = lb + (ub - lb) / 2;
            if (nums[mid] > target) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        return ub - 1;
    }
}