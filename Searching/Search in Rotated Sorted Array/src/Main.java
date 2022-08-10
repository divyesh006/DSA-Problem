import java.util.Scanner;

public class Main {
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if (arr[mid] >= arr[start]){
                start = mid + 1;
            } else {
                // arr[mid] <= arr[start]
                end = mid - 1;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        //if you did not find a pivot, it means the array is not rotated
        if (pivot == -1){
            // just do normal binary search;
            return binarySearch(arr,target,0,arr.length - 1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            //in Rotated sorted Array after pivot elements are smaller than start element
            //there we not need to search after pivot that's why here in binarySearch start is 0 and end is pivot-1
            return binarySearch(arr,target,0,pivot - 1);
        }
        return binarySearch(arr,target,pivot + 1, arr.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {10,12,13,14,16,17,20,25,27,0,1,3,5,6,7,9};
        System.out.println(search(arr,target));
    }
}