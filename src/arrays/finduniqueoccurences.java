package arrays;

import java.util.*;

public class finduniqueoccurences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(countoccurences(arr));

    }
    public static boolean countoccurences(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            s.add(m.getValue());
        }
        if(s.size() == map.size()){
            return true;
        }
        return false;
    }
}
