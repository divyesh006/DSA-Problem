import java.util.ArrayList;

public class Main {
    static int solve(ArrayList<Integer> A, int B) {
        int size = A.size();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i =0; i<B;i++){
            sum+= A.get(i);
        }
        max=sum;
        for(int i =1; i<=B;i++){
            sum = sum + A.get(size-i) - A.get(B-i);
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(5);
        A.add(-2);
        A.add(3);
        A.add(1);
        A.add(2);
       // A.add(5);
        System.out.println(solve(A, 3));

    }
}