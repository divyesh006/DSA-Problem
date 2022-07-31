import java.util.Scanner;

// https://leetcode.com/problems/maximum-subarray/
public class Main {
    static int max(int[] nums){
        int runningSum = 0,sum = 0;
        for (int i = 0; i < nums.length; i++){
            runningSum = runningSum + nums[i];
            if (runningSum < 0){     // if running sum is less than 0 then running sum sets to 0 because now it start to take sum from next index
                runningSum = 0;
            }
            if (runningSum > sum){
                sum = runningSum;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(max(nums));
    }
}