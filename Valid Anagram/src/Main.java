// https://leetcode.com/problems/valid-anagram/
public class Main {
    static boolean isAnagram(String s, String t){
        //if both string size is not same it is not Anagram because is in Anagram each character is used one time so size
        // should be same
        if (s.length() != t.length()){
            return false;
        }
        // if size of string is 1 then check both character is same or not if both character is same it will return true
        //else it,return false
        if (s.length() == 1){
            return s.equals(t);
        }
        // (An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once)
        //idea is that create 26 size of array for each character if character is available at suitable index ( for 'a' index is 0,
        // for 'b' index is 1 and so on) if character is available it will increment the value of suitable index in string s
        // so, basically it will count the character(means how many times character)of string in array if 'a' is available in
        //string 3 times then array index of 0 is 3 (arr[0] = 3) because it is available 3 times
        // now , in string t if character is available at suitable index it will decrement the array value
        // so, in last if string is Anagram so all elements of arr is 0
        // this will create 26 size of array because of 26 alphabetical character
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++){
            // a - a = 0  ;  b - a = 1 ;   c - a = 3
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){
            arr[t.charAt(i) - 'a']--;
        }
        for (int i : arr){
            //this will check all array elements are 0 or not
            if (i != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}