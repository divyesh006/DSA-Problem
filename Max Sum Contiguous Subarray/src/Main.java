// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
public class Main {
    static int maxSubArray(final int[] A){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <= A.length - 1; i++){
            sum = sum + A[i];
            if (sum < A[i]){
                sum = A[i];
            }
            if (maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}