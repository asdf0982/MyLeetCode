class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    
            return "";
        
        //int strs_length = strs.length;
        String model = strs[0];
        //String common_string;
        //String result = "";
        char Tchar;
        for (int j=0;j<model.length();j++){
            Tchar = model.charAt(j);
            for (int i=1;i<strs.length;i++){
                if (j>strs[i].length()-1) //样本字符数大于测试字符数
                    return model.substring(0,j);
                char temp = strs[i].charAt(j);
                if (Tchar!=temp)
                    return model.substring(0,j);
            }
        }
        return model;
    }
}