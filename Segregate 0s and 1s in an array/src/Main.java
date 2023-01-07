import java.util.Arrays;
// https://www.interviewbit.com/problems/segregate-0s-and-1s-in-an-array/
public class Main {
    static int[] solve(int[] A){
        int[] arr = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] == 0){
                arr[count++] = 0;
            }
        }
        while (count < A.length){
            arr[count++] = 1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,1};
        System.out.println(Arrays.toString(solve(arr)));
    }
}