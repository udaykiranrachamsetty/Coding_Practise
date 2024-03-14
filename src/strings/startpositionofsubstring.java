package strings;

import java.util.ArrayList;

public class startpositionofsubstring {
    public static void main(String[] args) {
        String s = "uday";
        String target = "ay";
        System.out.println(startposition(s,target));
    }
    public static int startposition(String s , String target){
        return s.indexOf(target);
    }
}
