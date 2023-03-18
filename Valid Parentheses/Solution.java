import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


class Solution {
    
    public static boolean isValid(String s) {
        Map<Character, Character> chars = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        chars.put('(', ')');
        chars.put('[', ']');
        chars.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(i == 0){
                if(chars.containsKey(current)){
                    stack.add(current);
                }
                else{return false;}
            }
            else{
                if(chars.containsKey(current)){
                    stack.add(current);
                }
                else{
                    char prev = ' ';
                    try {
                        
                        prev = chars.get(stack.pop());
                    } catch (Exception e) {
                        return false;
                    }

                    if( prev != current){
                        return false;
                    }
                }
            }
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
        System.out.println(isValid("()[]"));
        System.out.println(isValid("()[{}]"));
        System.out.println(isValid("({}[])"));
    }
}   
/*

*/