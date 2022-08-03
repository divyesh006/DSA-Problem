import java.util.Scanner;

public class Main {
    //floor of number means the greatest number that is smaller or equal to target element
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                //target found
                return arr[mid];
            }
        }
        // if target not found it will return the greatest number that is smaller to target element
        return arr[end];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(floor(arr,target));
    }
}