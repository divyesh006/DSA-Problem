public class Main {
    static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        if (word1 == word2){
            return true;
        }
        String sb1 = concatenated(word1);
        String sb2 = concatenated(word2);
        return sb1.equals(sb2);
    }
    static String concatenated(String[] str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}