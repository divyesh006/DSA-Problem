public class Main {
    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if (!isAlphaNum(ch1)){
                left++;
            }else if (!isAlphaNum(ch2)){
                right--;
            } else if (charValue(ch1) != charValue(ch2)) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
    static boolean isAlphaNum(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z');
    }
    static int charValue(char ch){
        if (ch >= 'a' && ch <= 'z'){
            return ch - 'a';
        } else if (ch >= 'A' && ch <= 'Z') {
            return ch - 'A';
        }
        return ch;
    }
    public static void main(String[] args) {
       // String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}