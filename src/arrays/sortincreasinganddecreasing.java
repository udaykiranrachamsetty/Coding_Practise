package arrays;
import java.util.*;
public class sortincreasinganddecreasing {
    public static void main(String[] args) {
        int[] arr = {8,7,1,6,5,9};
        Arrays.sort(arr); // 1,5,6,7,8,9
        int y = arr.length /2 -1 ;
        arr = swap(arr,y+1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] swap(int[] arr , int start , int end){
        int i = start;
        int j = end;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
