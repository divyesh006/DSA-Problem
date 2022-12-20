public class Main {
    static String freqAlphabets(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (i < s.length() - 2 && s.charAt(i + 2) == '#'){
                //here  1 is not '1' like that because Integer function is give int
                char ch = (char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1);
                sb.append(ch);
                i = i + 2;
            }else {
                //here is '1' because it s.charAt gives character
                char ch = (char)('a' + s.charAt(i) - '1');
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
}