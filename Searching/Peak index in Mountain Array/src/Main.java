import java.util.Scanner;
public class Main {
    static int mountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        //this loop will break when start and end both are equal
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]){
                //you are in asc part of array
                //this means you look right side of array
                // here we don't take mid element because here already mid element is less than mid + 1 element
                start = mid + 1;
            }else if (arr[mid] > arr[mid+1]){
                //you are in dec part of array
                //this means you look left side of array
                //here we take mid element in search range because this might be ans also
                //if we don't take mid element in range might possible after this element dec part start so this mid
                // is ans ... if we skip this real ans not will not find
               end = mid;
            }
        }
        // here we return end also because when loop breaks start and end both value are same.
        //so we can return anything
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mountain(arr));
    }
}