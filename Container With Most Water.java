class Solution {
    public int maxArea(int[] height) {
        int S = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int h = Math.min(height[i], height[j]);
            int t_s = h * (j-i);
            S = Math.max(S,t_s);
            if (height[i]<height[j])
                i++;
            else
                j--;
        }
        return S;

    }
}