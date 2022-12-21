// https://leetcode.com/problems/long-pressed-name/
public class Main {
    static boolean isLongPressedName(String name, String typed){
        if (name.equals(typed)){
            return true;
        }
        int i = 0, j = 0;
        while ( i < name.length() || j < typed.length()){
            if (i < name.length() &&  j < typed.length() && name.charAt(i) == typed.charAt(j)){
                if (j + 1 < typed.length() && typed.charAt(j) == typed.charAt(j + 1)){
                    if (i + 1 < name.length() && name.charAt(i) == name.charAt(i + 1)){

                    }else {
                       while (j + 1 < typed.length() && typed.charAt(j) == typed.charAt(j + 1)){
                           j++;
                       }
                    }
                }
                i++;
                j++;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "leelee";
        String typed = "lleeelee";

        // String name = "a";
       // String typed = "aaaaaaaaaa";

        //String name = "alex";
        //String typed = "aaleex";

        //String name = "saeed";
        //String typed = "ssaaedd";
        System.out.println(isLongPressedName(name, typed));
    }
}