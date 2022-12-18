// https://leetcode.com/problems/sorting-the-sentence/
public class Main {
    static String sortSentence(String s){
        if (s.length() == 0){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        String[] str = s.split(" ");
        String[] str1 = new String[str.length];
        for (int i = 0; i < str.length; i++){
            String s1 = str[i];
            int index = s1.charAt(s1.length() - 1) - '1';
            str1[index] = s1.substring(0, s1.length() - 1);
        }
        for (int i = 0; i < str.length; i++){
            sb.append(str1[i]);
            if (i != str.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}