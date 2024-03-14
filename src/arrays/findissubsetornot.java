package arrays;
import java.util.*;
public class findissubsetornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int[] arr1 = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        String s1 = input.nextLine();
        int[] arr2 = Arrays.stream(s1.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(issubset(arr1,arr2));
    }
    public static boolean issubset(int[] arr1 , int[] arr2){
        if(arr1.length > arr2.length){
            return false;
        }
        boolean flag = true;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr2.length;i++){
            if(!map.containsKey(arr2[i])){
                map.put(arr2[i],i);
            }
        }
        for(int i = 0 ; i < arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
