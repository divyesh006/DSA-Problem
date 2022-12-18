// https://leetcode.com/problems/longest-common-prefix/
public class Main {
    static String common(String str1, String str2){
        String result = "";
        for (int i = 0, j = 0; i < str1.length() && j <str2.length(); i++, j++){
            if (str1.charAt(i) != str2.charAt(j)){
               break;
            }
            result = result + str1.charAt(i);
        }
        return result;
    }
    static String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            prefix = common(prefix, strs[i]);
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        //String[] strs = {"flower","glow","slow"};
        System.out.println(longestCommonPrefix(strs));
    }
}