import java.util.Scanner;

//https://leetcode.com/problems/contains-duplicate/
public class Main {
    static boolean duplicate(int[] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(duplicate(nums));
    }
}