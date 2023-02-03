//https://www.interviewbit.com/problems/woodcutting-made-easy/
public class Main {
    static int solve(int[] arr, int height){
        int start = 1;
        int end = max(arr);
        //here long is required if we use int then it will fail on hard test cases
        long height1 = 0;
        int count;
        while (start <= end){
            height1 = 0;
            int mid = start + (end - start) / 2;
            for(int i = 0; i < arr.length; i++){
                if (arr[i] >= mid){
                    count = arr[i] - mid;
                    height1 = height1 + count;
                }
            }
            if (height1 == height){
                return mid;
            } else if (height1 > height) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        //here if exact ans not found then loop will exit at nearest ans
        //and nearest ans at end
        return end;
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {114, 55, 95, 131, 77, 111, 141};
        System.out.println(solve(arr,95));
    }
}