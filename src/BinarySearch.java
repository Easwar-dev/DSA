public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,13,24,37,44,59};
        System.out.println(binarySearch(arr,5));
    }
    private static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}