import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class Main {
    static int[] mismatch(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1){
                //here arr[index] is duplicate number and index + 1 is missing number
                //because index is not match according to value that's mean it is duplicate number,
                // and it is place of at missing number and missing number is index + 1
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1 ,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        //int[] arr = {1,2,2,4};
        int[] arr = {1,1};
        System.out.println(Arrays.toString(mismatch(arr)));
    }
}