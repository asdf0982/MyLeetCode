class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())    return -1;
        if (needle.length() == 0)   return 0;
        int res = haystack.length() - needle.length();
        for(int i = 0; i<=res;i++)
            if(haystack.substring(i,i+needle.length()).equals(needle))  
                return i;
        return -1;
    }
}