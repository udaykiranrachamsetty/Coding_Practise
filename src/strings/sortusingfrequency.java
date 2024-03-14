package strings;
import java.util.*;
public class sortusingfrequency {
    public static void main(String[] args) {
        String s = "udaykirann";
        System.out.println(sort(s));
    }
    public static String sort(String s){
        ArrayList<Character> result = new ArrayList<>();
        for(int i = 0 ; i < s.length();i++){
            result.add(s.charAt(i));
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < result.size();i++){
            char c = result.get(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
        Collections.sort(result,(n1,n2)->{
            int frequency1 = map.get(n1);
            int frequency2 = map.get(n2);
            if(frequency1 > frequency2){
                return -1;
            }
            if(frequency1 == frequency2){
                return n2-n1;
            }
            return 1;
        });
        StringBuilder c = new StringBuilder();
        for(int i =0 ; i < result.size();i++){
            c.append(result.get(i));
        }
        return c.toString();
    }
}
