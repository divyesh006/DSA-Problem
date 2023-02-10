// https://www.interviewbit.com/problems/vowel-and-consonant-substrings/
public class Main {
    static int isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return 1;
        }
        return 0;
    }
    static int solve(String str){
        int count = 0;
        int n = str.length();
        if (n <= 1){
            return 0;
        }
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < n; i++){
            vowel = vowel + isVowel(str.charAt(i));
        }
        consonant = n - vowel;
        for (int i = 0; i < n; i++){
            if (isVowel(str.charAt(i)) == 1){
                vowel--;
                count = count + consonant;
            }else {
                consonant--;
                count = count + vowel;
            }
        }
        return count % 1000000007;
    }
    public static void main(String[] args) {
        System.out.println(solve("aba"));
    }
}