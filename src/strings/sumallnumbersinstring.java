package strings;

import java.util.*;
public class sumallnumbersinstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int sum = 0;
        for(int i = 0 ; i < s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int x = Integer.parseInt(String.valueOf(s.charAt(i)));
                sum = sum + x ;
            }
        }
        System.out.println(sum);
    }
}
