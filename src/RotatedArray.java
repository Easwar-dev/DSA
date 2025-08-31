public class RotatedArray {
    //In this algorithm we find the element in rotated sorted array
    public static void main(String[] args) {
        int[] rotatedArray = {5, 6, 7, 8, 1, 2, 3, 4};
        int target = 7;
        System.out.println(findElement(rotatedArray, target));
    }

    private static int findElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}