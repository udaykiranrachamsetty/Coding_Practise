package arrays;
import java.util.*;
public class median {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7};
        System.out.println(median(arr));
    }
    public static float median(int[] arr){

        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            float i = (float) (arr.length - 1) /2;
            return (float) (arr[(int) Math.ceil(i)] + arr[(int) Math.floor(i)]) /2 ;
        }
        int i = (int)Math.floor((float)(arr.length-1)/2);
        return (float)arr[i];
    }
}
