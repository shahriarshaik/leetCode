import java.util.HashMap;
import java.util.Map;

class Solution {


    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<Character, Integer>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if(i != s.length()-1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
                sum = sum + roman.get(s.charAt(i+1)) - roman.get(s.charAt(i));
                i++;
            } else{
                sum = sum + roman.get(s.charAt(i));
            }
        }

        return sum;
    }
    /* 
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    */
}