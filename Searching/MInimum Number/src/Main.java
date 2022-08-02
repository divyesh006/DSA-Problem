import java.util.Scanner;

public class Main {
    //assume that arr.length is not equal t zero
    static int min(int[] a){
        int ans = a[0];
        for (int i = 1; i < a.length; i++){
            if(a[i] < ans){
                ans = a[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(min(a));
    }
}