import java.util.Scanner;

public class Main {
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if ( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[start] <= arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int rotationCount(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(rotationCount(arr));
    }
}