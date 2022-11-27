import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Main {
    static List<Integer> findAllDuplicates(int[] arr){
        List<Integer> ans = new ArrayList<>();
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
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,3,7,8,3,2,1};
        //int[] arr = {1,1,2};
        System.out.println(findAllDuplicates(arr));
    }
}