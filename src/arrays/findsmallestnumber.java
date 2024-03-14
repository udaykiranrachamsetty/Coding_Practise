package arrays;
import java.util.*;
public class findsmallestnumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("enter size of the array");
       int n = input.nextInt();
       int[] arr = new int[n];
       for(int i = 0 ; i < n;i++){
           arr[i] = input.nextInt();
       }
       Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
