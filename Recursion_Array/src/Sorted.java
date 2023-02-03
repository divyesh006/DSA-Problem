public class Sorted {
    static boolean sorted(int[] arr){
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int i) {
        if (arr[i] == arr.length - 1){
            return true;
        }
        return (arr[i] < arr[i + 1]) && helper(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,6,7,8,9};
        System.out.println(sorted(arr));
    }
}