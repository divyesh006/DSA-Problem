// https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class Main {
    static boolean halvesAreAlike(String s){
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        int n1 = containsVowels(s1);
        int n2 = containsVowels(s2);
        return n1 == n2;
    }
    static int containsVowels(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "book";
        //String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}