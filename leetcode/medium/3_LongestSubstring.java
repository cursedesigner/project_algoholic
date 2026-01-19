package LC3_LongestSubstring;

import java.util.HashSet;

/**
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Solve via sliding window
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int max_length = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max_length = Math.max(max_length, right - left + 1);
        }

        return max_length;
    }
}
