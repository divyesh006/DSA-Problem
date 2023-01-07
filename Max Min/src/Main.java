public class Main {
    // https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/
    static int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++){
            if (A[i] < min){
                min = A[i];
            }
            if (A[i] > max){
                max = A[i];
            }
        }
        return min + max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -4, 5, 3};
        System.out.println(solve(arr));
    }
}