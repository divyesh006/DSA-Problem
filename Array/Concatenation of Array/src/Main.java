import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/concatenation-of-array/
public class Main {
    static int [] concatenation(int[] arr){
        int [] ans = new int[2*arr.length];   //taking double size length of ans from arr
        for (int i = 0; i < ans.length; i++){    //  here assume arr size is 3
            if (i <= arr.length-1){            // here copy arr array into ons array from o to arr.length -1
                ans[i] = arr[i];               // here ans[0] = arr[0] & ans[1] = arr[1] & ans[2] = arr[2]
            }else {
                ans[i] = arr[i-arr.length];   // for ans[3] = arr[3-3]                  // which is equal to ans[4] = arr[1]
            }                                 // ans[4] = arr[4-3] & ans[5] = arr[5-3]
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(concatenation(arr)));
    }
}