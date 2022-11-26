//https://leetcode.com/problems/find-the-duplicate-number/
public class Main {
static int duplicate(int[] arr){
    int i = 0;
    while (i < arr.length){
        //this will check that element is in correct index is or not
        //if it is in correct index it will increment index and next index check
        //otherwise it will be run for swap and for finding duplicate
        if (arr[i] != i+1){
            int correct = arr[i] - 1;
            //this will check for current i value if element for current i'th value is at available at correct index
            //if for current value is available for its correct index that's mean that the value of i'th index is duplicate
            //if it is not contain correct value then it swap with correct value

            //over all this statement check that this value is available at it's correct index if it is not in correct index
            //it will swap value with it correct index
            //but if this value is available at it's correct index that's mean this value is duplicate and return that value
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                return arr[i];
            }
        }else {
            i++;
        }
    }
    return -1;
}
static void swap(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
    public static void main(String[] args) {
        //int[] arr = {1,3,4,2,2};
        int[] arr = {3,1,3,4,2};
        System.out.println(duplicate(arr));
    }
}