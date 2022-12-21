// https://leetcode.com/problems/robot-return-to-origin/
public class Main {
    static boolean judgeCircle(String moves){
        if (moves.length() == 0){
            return true;
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'U'){
                count1++;
            }else if (moves.charAt(i) == 'D'){
                count1--;
            }else if (moves.charAt(i) == 'L'){
                count2++;
            }else {
                count2--;
            }

        }
        return count1 == 0 && count2 == 0;
    }
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
}