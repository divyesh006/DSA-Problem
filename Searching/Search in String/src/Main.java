import java.util.Scanner;

public class Main {
    static boolean search(String str, char target){
        //if string is empty it return false
        if (str.length() == 0){
            return false;
        }
        //now we find the target char at every index of string
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // str.toCharArray()
        char target = sc.next().charAt(0);
        System.out.println(search(str,target));
    }
}