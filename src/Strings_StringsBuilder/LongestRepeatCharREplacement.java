package Strings_StringsBuilder;

public class LongestRepeatCharREplacement {
    //424. Longest Repeating Character Replacement
    //Medium
    //Topics
    //premium lock icon
    //Companies
    //You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
    //
    //Return the length of the longest substring containing the same letter you can get after performing the above operations.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "ABAB", k = 2
    //Output: 4
    //Explanation: Replace the two 'A's with two 'B's or vice versa.
    //Example 2:
    //
    //Input: s = "AABABBA", k = 1
    //Output: 4
    //Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
    //The substring "BBBB" has the longest repeating letters, which is 4.
    //There may exists other ways to achieve this answer too.

    public int characterReplacement(String str, int k){
        if (str == null || str.isEmpty()) return 0;

        int[] occurence = new int[26]; // creating new array of length 26
        int left = 0;
        int maxOcurence = 0;
        int maxWindowLength =  0;

        for (int right = 0; right < str.length(); right++) {
            int currentIndex = str.charAt(right) - 'A';
            occurence[currentIndex]++;

            maxOcurence = Math.max(maxOcurence,occurence[currentIndex]);

            int currentWindowidth = right - left + 1;
            if (currentWindowidth - maxOcurence > k){
                int leftCharIndex = str.charAt(left) - 'A';
                occurence[leftCharIndex]--;
                left++;
            }
            maxWindowLength = Math.max(maxWindowLength,right - left + 1);
        }
        return maxWindowLength;
    }

    public  void main(String[] args) {
        String str = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(str,k));

    }
}
