class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap();
        HashMap<Character,Integer> map2 = new HashMap();
        map1 = String2Map(s);
        map2 = String2Map(t);
        char[] chars = t.toCharArray();
        for(char c:chars){
            if(!map1.containsKey(c))
                return c;
            if(map2.get(c)!=map1.get(c))
                return c;
        }
        return 'a';
    }
    public HashMap String2Map(String s){
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap();
        for(char c:chars){
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        return map;
    }
}