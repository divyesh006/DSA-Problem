import java.util.Scanner;

//https://leetcode.com/problems/richest-customer-wealth/
public class Main {
    static int max(int[][] a){
        int max = 0,currentMax;
        for (int i = 0; i < a.length; i++){
            currentMax = 0;      // this will become is 0 after below loop end...
            for (int j = 0; j < a[i].length; j++){            // because it will store other column sum also...
                currentMax = currentMax + a[i][j];  // this is sum of column
            }
            if (currentMax > max){     // if the sum of iTH column is greater than other column
                max = currentMax;      //then it store value in max value and again loop start
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(max(a));
    }
}