import java.util.Scanner;

public class Main {
    static int linearSearch(int[] arr,int target,int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(linearSearch(arr,target,start,end));
    }
}