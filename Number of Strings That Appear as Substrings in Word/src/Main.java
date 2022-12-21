// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class Main {
    static int numOfStrings(String[] patterns, String word){
        if(patterns.length == 0 || word.length() == 0){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < patterns.length; i++){
            if (word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }
}