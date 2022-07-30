import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/build-array-from-permutation/
//Array's elements is from 0 to array.length-1
//A zero-based permutation num is an array of distinct integers from 0 to num.length - 1 (inclusive).
public class Main {
    static int[] permutation(int[] arr){
        int[] ans = new int[arr.length];   //taking ans array of arr.length
        for (int i = 0; i < arr.length; i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(permutation(arr)));
    }
}