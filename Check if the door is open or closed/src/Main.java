import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/check-if-the-door-is-open-or-closed2013/1
public class Main {
    static int[] checkDoorStatus(int n){

        int[] arr = new int[n];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if ((i * j) - 1 < n){
                    if (arr[(i * j) - 1] == 1){
                        arr[(i * j) - 1] = 0;
                    }else {
                        arr[(i * j) - 1] = 1;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(checkDoorStatus(1)));
    }
}