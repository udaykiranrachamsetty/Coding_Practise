package arrays;
import java.util.*;
public class practise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        arr = toppers(arr);
        if(Arrays.toString(arr).equals("[]")){
            System.out.println("No toppers");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] toppers(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <=2 ; i++){
            int avg = (arr[i] + arr[i+3]+ arr[i+6])/3;
            if(avg > max){
                max = avg;
            }
            map.put(i+1,avg);
        }
        if(max <= 70){
            return new int[0];
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue() == max){
                result.add(m.getKey());
            }
        }
        arr = result.stream().mapToInt(k->k).toArray();
        return arr;
    }
}
