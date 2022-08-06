import java.util.Scanner;

public class Main {
    static int ans(int[] arr, int target){
        //here we are taking the range of array because we don't know the size of array
        // in that range if we not found that target element we extend the range of search
        int start = 0;
        int end = 1;
        //this loop end when target is equal to or less than end index of taking our range
        while (target > arr[end]){
            //here if we don't found element we extend the size of range(double size)
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        // after the exit from loop this return the start and end index of array between target element store
        return binarySearch(arr,target,start,end);
    }
    // here in this function we search for element in given start and end position
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
        int[] arr = { 2, 4, 6, 8, 20, 30, 50, 55, 66, 78, 88, 89, 94, 97, 99};
        int target = sc.nextInt();
        System.out.println(ans(arr,target));
    }
}