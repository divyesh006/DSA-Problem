//https://www.interviewbit.com/problems/capacity-to-ship-packages-within-b-days/
public class Main {
    static int solve(int[] arr, int days){
        int start = 0;
        int end = 0;
        for (int i : arr){
            start = Math.max(i,start);
            end = end + i;
        }
        if (arr.length == days){
            return start;
        }
        while (start < end){
            int mid = start + (end - start) / 2;
            if (possible(arr, days, mid)) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static boolean possible(int[] arr, int days, int capacity){
        int count = 1;
        int sum = 0;
        for (int i : arr){
            if (sum + i > capacity){
                count++;
                sum = 0;
            }
            sum = sum + i;
        }
        return count <= days;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solve(arr, 5));
    }
}