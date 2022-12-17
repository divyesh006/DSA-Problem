// https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1
public class Main {
    static String removeConsecutiveCharacters(String s){
        StringBuilder sb = new StringBuilder(s);
        int counter = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i - 1)){
                sb.deleteCharAt(i - counter);
                counter++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aaaaaaabbbbbbb";
        System.out.println(removeConsecutiveCharacters(s));
    }
}