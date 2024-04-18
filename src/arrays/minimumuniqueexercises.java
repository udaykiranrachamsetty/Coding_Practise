package arrays;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverse;

public class minimumuniqueexercises {
    public static void main(String[] args) {
        int[] arr = {1,5,2};
        int n = 2;
        System.out.println(minimumunique(arr,n));
    }
    public static int minimumunique(int[] arr,int n){
        Arrays.sort(arr);
        int count = 0 ;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            if(arr[i] == n){
                count = count + 1;
                return count;
            }
            else if (arr[i] < n){
                n = n - arr[i]*2;
                System.out.println(n);
                count = count + 2;
                if(n <= 0){
                    return count;
                }
            }
        }
        return -1;
    }
}
