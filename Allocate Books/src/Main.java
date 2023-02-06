//https://www.interviewbit.com/problems/allocate-books/
public class Main {
    static int books(int[] arr, int student){
        int start = 0;
        int end = 0;
        for (int i : arr){
            if (start < i){
                start = i;
            }
            end = end + i;
        }
        int minPages = start;
        int sumOfPages;
        int student1;
        if (arr.length == student){
            return minPages;
        }
        if (student == 1){
            return end;
        }
        if (arr.length < student){
            return -1;
        }
        if (arr.length == 1 && student == 1){
            return end;
        }
        while (start < end){
            sumOfPages = 0;
            student1 = 1;
            int mid = start + (end - start) / 2;
            for (int i = 0; i < arr.length; i++){
                sumOfPages = sumOfPages + arr[i];
                if (sumOfPages > mid){
                    student1++;
                    sumOfPages = arr[i];
                }
            }
            if (student1 <= student){
                minPages = mid;
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return minPages;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        System.out.println(books(arr, 2));
    }
}