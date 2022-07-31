import java.util.Scanner;
//https://leetcode.com/problems/number-of-good-pairs/
public class Main {
    static int goodPair(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){  //because in question A pair (i, j) is called good if nums[i] == nums[j] and i < j.
                if (nums[i] == nums[j]){             //its start from comparing next index suppose current index is 3(i) so it will start comparing from index 4(j)
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println((goodPair(nums)));
    }
}