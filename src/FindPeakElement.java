public class FindPeakElement {
    //find the peak element in an mountain array;
    public static void main(String[] args){
        int[] nums = {1,2,4,5,7,4,3,2};
        System.out.println(findPeak(nums));
    }
    public static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}