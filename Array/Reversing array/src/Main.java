import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void reverse(int[] arr){
        int start = 0;   // starting index of array is 0
        int end = arr.length-1;  //because index is starting from 0 there for end point is length - 1
        while (start < end){   // this loop will End when start and end will become 0
            swap(arr, start, end);  // calling swap function for swapping start point and end point value
            start++;  //start point will be incrementing because it at starting index of array
            end--;    //end point will be decrementing because it ar ending index of array
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];         //this function will swap the value of start point and end point.
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}