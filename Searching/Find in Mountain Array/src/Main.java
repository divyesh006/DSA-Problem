import java.util.Scanner;

public class Main {
    static int mountain(int[] arr, int target){
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
        index = binarySearch(arr, target, 0, end,true);
        if (index == -1){
            index = binarySearch(arr, target, start,arr.length - 1, false);
        }
        return index;
    }
    static int binarySearch(int[] arr, int target, int start, int end,boolean isAsc){
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(mountain(arr, target));
    }
}