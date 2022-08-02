import java.util.Scanner;

public class Main {
    //this function will count how many elements have even numbers of digits in array
    static int evenDigits(int[] a){
        int count = 0;
        for (int num : a) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    //this function check the number contains even digits or not
    static boolean even(int a){
        int numberOFDigits = digits(a);
         return (numberOFDigits % 2 == 0);
    }
    //this function count the digit in number
    static int digits(int a){
        if (a < 0){
            a = a * -1;
        }
        int count = 0;
        while (a > 0){
            count ++;
             a= a/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(evenDigits(a));
    }
}
