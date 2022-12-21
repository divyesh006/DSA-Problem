// https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
public class Main {
    static String numericKeypad(String s, int[] arr){
        StringBuilder sb = new StringBuilder();
        if(s.length() == 0){
            return " ";
        }
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                sb.append(0);
            }else {
                int position = s.charAt(i) - 'A';
                sb.append(arr[position]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] arr = {2, 22, 222, 3, 33, 333,
                     4, 44, 444, 5, 55, 555,
                     6, 66, 666, 7, 77, 777, 7777,
                     8, 88, 888, 9, 99, 999, 9999};
        String s = "GEEKSFORGEEKS";
        System.out.println(numericKeypad(s,arr));
    }
}