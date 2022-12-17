// https://leetcode.com/problems/shuffle-string/
public class Main {
    static String restoreString(String s, int[] indices){
        String t = "";
        char ch;
        for (int i = 0; i < s.length(); i++){
            ch = s.charAt(indices[i]);
            t = t + ch;
        }
        return t;
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
}