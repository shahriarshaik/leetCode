import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class Solution {
    
    public static boolean isValid(String s) {
        Map<Character, Character> chars = new HashMap<>();
        Map<Character, Integer> charAmount = new HashMap<>();
        chars.put('(', ')');
        chars.put('[', ']');
        chars.put('{', '}');

        charAmount.put('(', 1);
        charAmount.put('[', 1);
        charAmount.put('{', 1);
        charAmount.put(')', -1);
        charAmount.put(']', -1);
        charAmount.put('}', -1);

        

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            char next;
            try {
                next = s.charAt(i + 1);
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }



            if(chars.get(current) != next){
                int indexADD = 0;
                char pointer = current;
                int count = i;
                while(pointer != chars.get(current)){
                    count++;
                    pointer = s.charAt(count);
                    if(pointer != chars.get(current)){
                        indexADD = indexADD + charAmount.get(pointer);
                    }
                }
                if(indexADD != 0 ){
                    return false;
                }
                i--;

            }
            i++;

        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()[]"));
        System.out.println(isValid("()[{}]"));
        System.out.println(isValid("({}[])"));
    }
}   