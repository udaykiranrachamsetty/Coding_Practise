package strings;

import java.util.ArrayList;

public class countvowels {
    public static void main(String[] args) {
        String s = "Take u forward is Awesome";
        count(s);
    }
    public static void count(String s){
        s = s.toLowerCase();
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');
        int vowels = 0;
        int spaces = 0;
        int consonants = 0;
        for(int i = 0 ; i < s.length();i++){
            if(!arr.contains(s.charAt(i)) && s.charAt(i) != ' '){
                consonants += 1;
                continue;
            }
            else if(arr.contains(s.charAt(i))){
                vowels += 1;
                continue;
            }
            else{
                spaces += 1;
            }
        }
        System.out.println(vowels);
        System.out.println(spaces);
        System.out.println(consonants);
    }
}
