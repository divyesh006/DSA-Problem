import java.util.Arrays;
// https://www.interviewbit.com/problems/find-duplicate-in-array/
public class Main {
    static int repeatedNumber(final int[] A){
        int[] arr = A;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != i + 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(repeatedNumber(arr));
    }
}