import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Main {
    // this function will return starting and ending index of array
    static int[] search(int[] nums, int target){
        // this is set if target not found this value is return
        int[] ans = {-1, -1};
        int start = binarySearch(nums,target,true);
        int end = binarySearch(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    //this function find the index of target
    static int binarySearch(int[] nums, int target, boolean findStartIndex){
        // if target not found this will return
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
                // if we want to find starting index of target elements end will become mid -1...(left side towards to start point)
                //else we want find ending index of elements start will become mid +1...(right side towards to end point)
                if (findStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        // this will return final starting / ending index of target
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(a, target)));
    }
}