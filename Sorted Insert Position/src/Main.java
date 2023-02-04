import java.util.ArrayList;
//https://www.interviewbit.com/problems/sorted-insert-position/
public class Main {
    static int searchInsert(ArrayList<Integer> a, int b){
        int start = 0;
        int end = a.size() - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (a.get(mid) == b){
                return mid;
            }
            if (a.get(mid) < b){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        //when we don't fount ans then loop will exit at when it should be inserted at index
        //then ans will always start
        return start;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(searchInsert(list, 2));
    }
}