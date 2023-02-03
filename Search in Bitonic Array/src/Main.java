//https://www.interviewbit.com/problems/search-in-bitonic-array/
public class Main {
    static int mount(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int index;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        index = binarySearch(arr, target, 0, end, true);
        if (index == -1){
            index = binarySearch(arr, target, start, arr.length - 1, false);
        }
        return index;
    }
    static int binarySearch(int[] arr, int target, int start, int end, boolean isAsc){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (arr[mid] < target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if (arr[mid] < target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 9, 10, 20, 17, 5, 1};
        System.out.println(mount(arr,20));
    }
}