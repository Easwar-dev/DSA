public class FindInMountainArray {
    public static void main(String[] args){
        int[] nums = {1,3,4,5,7,5,3,2};
        int target = 2;
        System.out.println(search(nums,target));
    }
    //this method for call other algorithms;
    public static int search(int[] arr, int target){
        int peak = findPeakElement(arr);
        int checksInAscending = orderAgnosticBS(arr,target,0,peak);
        if(checksInAscending != -1) return checksInAscending;
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    // This algorithm to find the peak element in the mountain array;
    private static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    //this is binary search works both Ascending and Descending sorted array
    //in this algorithm we have a both in single Array, So i gonna use start and end indices to guide the search
    private static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAscending = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
/*
In this algorithm we use Binary Search it's mean log n + log n = 2 log n
avoid constant so the | Time Complexity => O(log n) |
the | Space Complexity => O(1) |
 */