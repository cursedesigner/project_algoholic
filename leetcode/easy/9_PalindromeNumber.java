package LC9_PalindromeNumber;

class Solution {
    public boolean isPalindrome(double x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        double half = 0;

        while (x > half) {
            half = half * 10 + (x % 10);

            x = Math.floor(x / 10);
        }

        if (x == half || x == Math.floor(half / 10)) {
            return true;
        } else {
            return false;
        }
    }
}