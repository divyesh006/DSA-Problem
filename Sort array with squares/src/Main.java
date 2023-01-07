import java.util.Arrays;
// https://www.interviewbit.com/problems/sort-array-with-squares/
public class Main {
    static int[] solve(int[] A){
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++){
            arr[i] = A[i] * A[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={-6, -3, -1, 2, 4, 5};
        System.out.println(Arrays.toString(solve(arr)));
    }
}