import java.util.Scanner;

public class Main {
    //Ceiling of number means the smallest element in array greater or equal to target
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                //ans found
                return arr[mid];
            }
        }
        //if target not found it will return the smallest element greater than target element
        return arr[start];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(ceiling(arr,target));
    }
}