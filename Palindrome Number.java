class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int result = 0;
        int tail = 0;
        if (x < 0)
            return false;
        while (x != 0)
        {
            tail = x % 10;
            x = x / 10;
            result = result * 10;
            result += tail;
        }
        if (result != temp )    
            return false;
        else
            return true;
    }
}