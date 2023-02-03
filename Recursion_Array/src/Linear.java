public class Linear {
    static boolean find(int[] arr, int target){
        return helper(arr, target, 0);
    }
    static int findIndex(int[] arr, int target){
        return helper1(arr, target, 0);
    }

    private static int helper1(int[] arr, int target, int index) {
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return helper1(arr, target, index + 1);
        }
    }

    private static boolean helper(int[] arr, int target, int i) {
        if (i == arr.length){
            return false;
        }
        return arr[i] == target || helper(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,5,8,9,22,33,54,485};
        System.out.println(find(arr, 22));
        System.out.println(findIndex(arr, 22));
    }
}
