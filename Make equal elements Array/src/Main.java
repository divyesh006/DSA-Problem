import java.util.Arrays;
import java.util.HashSet;
// https://www.interviewbit.com/problems/make-equal-elements-array/
public class Main {
    static int solve(int[] A, int B){
        Arrays.sort(A);
        HashSet<Integer> set = new HashSet<>();
        set.add(A[0]);
        set.add(A[0] + B);
        //set.add(A[0] - B);
        for (int i = 1; i < A.length; i++){
            if (!set.contains(A[i]) && !set.contains(A[i] - B)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4};
        System.out.println(solve(arr, 1));
    }
}