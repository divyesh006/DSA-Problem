import java.util.Arrays;
// https://www.interviewbit.com/problems/wave-array/
public class Main {
    static int[] wave(int[] A){
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++){
            swap(A,i,i+1);
            i++;
        }
        return A;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(wave(arr)));
    }
}