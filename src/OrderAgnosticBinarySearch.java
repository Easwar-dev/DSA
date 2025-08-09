public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = {45,23,19,15,12,9,5};
        System.out.println(binarySearch(arr,19));
    }
    private static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        //first find the array was sorted in ascending or descending
        boolean isAscending = nums[start] < nums[end];

        while(start <= end){
            int mid = start + (end - start)/2; //to prevent integer overflow.
            if(isAscending){
                if(target < nums[mid]){
                    end = mid-1;
                }else if(target > nums[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }else{ //if isAscending is false, this else statement will execute
                if(target > nums[mid]){
                    end = mid-1;
                }else if(target < nums[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
//Time complexity => O(log n)
//Space complexity => O(1)
