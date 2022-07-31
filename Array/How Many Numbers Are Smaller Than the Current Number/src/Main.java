import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class Main {
    static int[] smallerNumber(int[] nums){
        int[] counter = new int[nums.length];
        int count;
        //Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            count = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[i] == nums[j]){   // if both numbers are this will skip the loop
                    continue;
                }
                if (nums[i] > nums[j]){
                    count++;
                }
                counter[i] = count;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumber(nums)));
    }
}