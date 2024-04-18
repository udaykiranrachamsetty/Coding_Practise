package arrays;

import java.util.*;
public class hcf {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int[] arr1 = factors(a);
        for(int i = 0 ; i < arr1.length;i++){
            set.add(arr1[i]);
        }
        int[] arr2 = factors(b);
        int max = 0;
        for(int i = 0 ; i < arr2.length;i++){
            if(set.contains(arr2[i]) && arr2[i] > max){
                max = arr2[i];
            }
        }
        System.out.println("hcf " + max);
        System.out.println("lcm " + (a*b)/max);
    }
    public static int[] factors(int n){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                a.add(i);
            }
        }
        return a.stream().mapToInt(k->k).toArray();
    }
}
