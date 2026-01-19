package LC20_ValidParentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/submissions/1829110092
 * First version my solution
 */
class Solution {
    HashMap<Character, Character> keys = new HashMap<>();

    {
        keys.put('}', '{');
        keys.put(']', '[');
        keys.put(')', '(');
    }

    public boolean isValid(String s) {
        List<Character> open =  new ArrayList();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) ==  '[' || s.charAt(i) == '('){
                open.add(s.charAt(i));
                count++;
            }

            if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                if(open.size() > 0 && open.get(count - 1) == keys.get(s.charAt(i))) {
                    open.remove(count - 1);
                    count--;
                } else {
                    return false;
                }
            }
        }

        System.out.println(count);


        if (count > 0) {
            return false;
        }

        return true;
    }
}
