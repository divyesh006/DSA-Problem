public class Main {
    //https://www.interviewbit.com/problems/smaller-or-equal-elements/
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                //here count is mid + 1 because target is found at mid that mean till mean all are smaller than target
                //and +1 because of index os starting from 0
                count = mid + 1;
                start = mid + 1;
            } else if (arr[mid] < target) {
                //here also count + 1 because target is greater than mid that mean till mid all are smaller than target
                //and till now count is equal to mid + 1
                count = mid + 1;
                start = mid + 1;
            }else {
                //here count is equal to mid that mean target is less than mid and after mid all are bigger number therefore
                //till now count is equal to mid
                count = mid;
                end = mid - 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5}; // 1,2,4,4,6
        System.out.println(binarySearch(arr,3));
    }
}