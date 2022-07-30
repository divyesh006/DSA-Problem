import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class Main {
    static int[] sum(int[] a){
        int[] runningSum = new int[a.length];
        int sum = 0;
        for (int i = 0;i < a.length; i++){
            sum = sum + a[i];     //this is running sum from index0
            runningSum[i] = sum;   //and this will store running sum in iTH index of runningSum array
        }
        return runningSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sum(a)));
    }
}