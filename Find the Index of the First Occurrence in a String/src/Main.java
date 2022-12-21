// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class Main {
    static int strStr(String haystack, String needle){
        if (!haystack.contains(needle)){
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            String s = haystack.substring(i, i + needle.length());
            if (s.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "abdbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}