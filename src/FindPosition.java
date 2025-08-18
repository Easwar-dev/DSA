import java.util.Arrays;

public class FindPosition {
    //find the first and last position of the target element. if we can't find return {-1,-1};
    //we will use binarySearch, as we concern the efficiency
    public static void main(String[] args){
        int[] ans = {-1,-1};
        int[] arr = new int[] {1,1,2,3,3,4,4,4,5,5,7,7,7,8,8};
        int target = 4;
        ans[0] = findPosition(arr,target,true); //true for first position
        if(ans[0] != -1){
            ans[1] = findPosition(arr,target,false);//false for end position
        }
        System.out.println(Arrays.toString(ans));
    }
    // the boolean expression for find the start index and end index;
    private static int findPosition(int[] nums,int target,boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
//Time Complexity => O(log n)
//Space Complexity => O(1)