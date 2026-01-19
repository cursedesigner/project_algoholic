package LC58_LengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()) return 0;

        char string[] = s.toCharArray();

        boolean skipSpaces = true;
        int count = 0;
        for(int i = string.length - 1; i >= 0; i--) {
            if(skipSpaces && string[i] == ' ') {
                continue;
            } else {
                skipSpaces = false;
            }

            if(string[i] != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}