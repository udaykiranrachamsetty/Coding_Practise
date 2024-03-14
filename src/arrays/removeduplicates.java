package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class removeduplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,1,9,3,1,3,9};
        System.out.println(Arrays.toString(removeduplicates(arr)));

    }
    public static int[] removeduplicates(int[] arr){ // tc = o(n) sc = o(c) c = size of the arraylist
        ArrayList<Integer> a = new ArrayList<>();
        for (int j : arr) {
            if (!a.contains(j)) {
                a.add(j);
            }
        }
        return a.stream().mapToInt(k->k).toArray();

    }
}
