public class CeilingNumber {
        //Ceiling number means the smallest integer greater than or equal to the target element.
        public static void main(String[] args){
            int[] arr = new int[] {2,5,12,16,20,26,29,32,37,44,56};
            int target = 41;
            System.out.println(ceilingNum(arr,target));
        }
        private static int ceilingNum(int[] nums,int target){
            int start = 0;
            int end = nums.length-1;

            while(start <= end){
                int mid = start + (end-start)/2;
                if(target < nums[mid]){
                    end = mid - 1;
                }else if(target > nums[mid]){
                    start = mid + 1;
                }else {
                    return nums[mid];
                }
            }
            return nums[start];
        }
}
// Time complexity => O(log n)
// Space complexity => O(1)

