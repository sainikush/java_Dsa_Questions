package Strings_StringsBuilder;

import java.util.HashSet;

public class SubstringWithoutReplacement {

    public int longestSubstring(String s){
        if(s == null || s.isEmpty()) return 0;
        if(s.length() == 1) return 1;

        HashSet<Character> lastIndex = new HashSet<>();

        int left = 0;
        int maxUniqueLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (lastIndex.contains(currentChar)){
                lastIndex.remove(s.charAt(left));
                left++;
            }

            lastIndex.add(currentChar);
            maxUniqueLength = Math.max(maxUniqueLength,right - left + 1);
        }
        return maxUniqueLength;
    }

    public  void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }

}
