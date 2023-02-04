import java.util.Arrays;

public class Main {
    static int[] searchRange(int[] A, int B){
        if (A.length == 1){
            if (A[0] == B){
                return new int[] {0,0};
            }
        }
        int[] ans = {-1, -1};
        int start = binarySearch(A, B, true);
        int end = binarySearch(A, B, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int binarySearch(int[] arr, int target, boolean startingIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                mid = ans;
                if (startingIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 17, 100, 111};
        System.out.println(Arrays.toString(searchRange(arr, 3)));
    }
}