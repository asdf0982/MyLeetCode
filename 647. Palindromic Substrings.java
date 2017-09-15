//我的方法非常粗暴.找到所有的子字符串,然后判断是否是回文
class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        for(int i=0; i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if (isPalindromic(s.substring(i,j)))
                    result++;
            }
        }
        //result=result+s.length();
        return result;
    }
    public boolean isPalindromic(String s){
        StringBuffer sb1 = new StringBuffer();
        sb1.append(s);
        if (sb1.toString().equals(sb1.reverse().toString()))
            return true;
        return false;
    }
}

//看到一个很好的办法
//把单个或两个字符视为回文的"核", 然后往外扩增.
//这么编程的理由就是每个回文的核只有一个.
int count =1;
public int countSubstrings(String s) {
    if(s.length()==0) 
        return 0;
    for(int i=0; i<s.length()-1; i++){
        checkPalindrome(s,i,i);     //To check the palindrome of odd length palindromic sub-string
        checkPalindrome(s,i,i+1);   //To check the palindrome of even length palindromic sub-string
    }
    return count;
}    

private void checkPalindrome(String s, int i, int j) {
    while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){    //Check for the palindrome string 
        count++;    //Increment the count if palindromin substring found
        i--;    //To trace string in left direction
        j++;    //To trace string in right direction
    }
}