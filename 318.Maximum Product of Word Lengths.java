class Solution {
    public int maxProduct(String[] words) {
        int result = 0;
        int temp=0;
        for(int i=0; i<words.length-1; i++){
            String tempA = words[i];
            for(int j=i+1; j<words.length;j++){
                String tempB = words[j];
                //找到两个字符串
                if(sameLetter(tempA,tempB)==0){
                    temp = tempA.length()*tempB.length();
                    if(temp>result) result = temp;
                }
            }
        }
        return result;
    }
    public int sameLetter(String A, String B){
        //对比是否包含相同字母
        for(int k=0; k<A.length(); k++){
            char c = A.charAt(k);
            for(int l=0; l<B.length(); l++){
                if(c==(B.charAt(l))){
                    return 1;
                }
            }
        }
        return 0;
    }
    
}