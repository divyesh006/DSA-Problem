import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Main {
    static boolean[] greatest(int[] candies, int extraCandies){
        boolean[] result = new boolean[candies.length];
        int count;
        for (int i = 0; i < candies.length; i++){
            count = 0;   //this will become 0 after compare one student's candies to other student... for new student this will star from 0
            for (int j = 0; j < candies.length; j++){   // this loop will compare the current index value to other index value in the same array
                if (candies[i] + extraCandies >= candies[j] ){    // if we give extraCandies to current student this condition check that current student has greater number of candies or not
                    count++;               // after the give extraCandies if current student has max candies this count variable will increment
                }
            }
            result[i] = count == candies.length;  //this is one type of if-else statement (count == candies.length) is condition if this is true or false this boolean value will store in the result array
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < candies.length; i++){
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        System.out.println(Arrays.toString(greatest(candies,extraCandies)));
    }
}