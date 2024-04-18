package strings;

import java.util.*;
public class strings {
    public static void main(String[] args) {
        String s = "This is uday";
        char[] sa = s.toCharArray();
        System.out.println(Arrays.toString(sa));
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < sa.length;i++ ){
            if(i == 0 || i == sa.length-1){
                sb.append(String.valueOf(sa[i]).toUpperCase());
            }
            else if (sa[i+1] == ' ' || sa[i-1] == ' '){
                sb.append(String.valueOf(sa[i]).toUpperCase());
            }
            else{
                sb.append(sa[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
