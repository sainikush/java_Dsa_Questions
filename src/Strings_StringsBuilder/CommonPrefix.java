package Strings_StringsBuilder;

public class CommonPrefix {
    // leetCode 14 Longest Common Prefix
    // Write a function to find the longest common prefix String amongst the array of strings
    // if there is no common prefix, return an empty string " ";

    public static String longestCommonSubstring(String[] str){
        if(str == null || str.length == 0) return "";

        // starting with first string in the array as intial prefix
        String prefix = str[0];

        // compare the current prefix with each String in the array
        for (int i = 0; i < str.length; i++) {
            // narrow down the prefix with each comparison
            while (str[i].indexOf(prefix) != 0){
                // shorten the prefix by one character from the end
                prefix = prefix.substring(0,prefix.length() - 1);

                // if the prefix becomes empty there is no commmon prefix
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        longestCommonSubstring(str);
        System.out.println(longestCommonSubstring(str));

    }
}
