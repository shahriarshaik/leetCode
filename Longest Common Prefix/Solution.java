import java.util.Arrays;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        char[] firstARR = first.toCharArray();
        char[] lastARR = last.toCharArray();
        String returnString = "";
        for (int i = 0; i < first.length(); i++) {
            char firstLetter = firstARR[i];
            char lastLetter;
            try {
                lastLetter = lastARR[i];
            } catch (Exception e) {
                break;
            }
            if(firstLetter == lastLetter){
                returnString = returnString + firstLetter;
            }
            else{
                break;
            }
        }
        return returnString;
    }


    /*
    public static void main(String[] args) {
        String[] in = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(in));
        
    }
     */
}