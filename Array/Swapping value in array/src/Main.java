import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];    //store index1 value in temp
        arr[index1] = arr[index2];  // store index2 value in index1
        arr[index2] = temp;      // now store the temp value(originally index1 value) in index2
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      //taking the length of array
        int [] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();   // taking input of array
        }
        swap(arr,sc.nextInt(),sc.nextInt());  // calling swap function
        System.out.println(Arrays.toString(arr));  // print array after swapping
    }
}