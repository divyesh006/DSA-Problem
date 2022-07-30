import java.util.Scanner;

public class Main {
    static int max(int [] arr){
        int maxVal = arr[0]; // asume that index 0 has max value
        for (int i = 1; i < arr.length; i++){   //checking max value from index 1
            if (arr[i] > maxVal){
                maxVal = arr[i];   // if current index value is greater than maxVal
            }                        //  then it store now current value as max val
        }
        return maxVal;    //returning max value
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // taking length of array
        int [] arr = new int[n];
        for (int i = 0;i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr));
    }
}