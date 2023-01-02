public class Main {
    static boolean canReach(String s, int minJump, int maxJump){
        if (s.charAt(s.length() - 1) != '0' || s.charAt(0) != '0'){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            int count = 0;
            for (int j = i + 1; j < s.length(); j++){
                count++;
                if (count <= maxJump){
                    if (s.charAt(j) == '0'){
                        int range = j - i;
                        if (range <= maxJump && range >= minJump){
                            i = j;
                            count = 0;
                        } else if (j == s.length() - 1 && !(range <= maxJump && range >= minJump)) {
                            return false;
                        }
                    }
                }else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "0000000000";
        int minJump = 2, maxJump = 5;
        System.out.println(canReach(s, minJump, maxJump));
    }
}