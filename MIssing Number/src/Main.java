import java.util.Scanner;

//https://leetcode.com/problems/missing-number/
public class Main {
    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            //index is starting from 0 and elements also starting from 0
            int correct = arr[i];
            //if arr[i] is equal to arr.length then skip that step because in array elements are starting from 0
            //so suppose arr.length is equal to 4 then elements in question is 0,1,2,3,4
            //but in array element are only four(4) and if 4 is available in array it swap is out of bound
            if (arr[i] != arr[correct] && arr[i] < arr.length){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
        //search for element if all element are set according to index
        for (int index = 0; index < arr.length; index++){
            //if index are not same as elements then that index is missing number
            if (arr[index] != index){
                return index;
            }
        }
        //if all elements are same as index then the length of array in missing number
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int missing = missingNumber(arr);
        System.out.println("Missing Number is:" +missing );
    }
}