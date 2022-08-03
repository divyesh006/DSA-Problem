import java.util.Scanner;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Main {
    static char nextGreatestLetter(char[] arr, char target){
        if (target >= arr[arr.length - 1]){
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else {
                return arr[mid+1];
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i= 0; i < arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }
        char target = sc.next().charAt(0);
        System.out.println(nextGreatestLetter(arr,target));
    }
}