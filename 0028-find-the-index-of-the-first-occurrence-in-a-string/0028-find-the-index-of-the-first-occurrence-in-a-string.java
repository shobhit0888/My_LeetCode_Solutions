class Solution {
    public int strStr(String haystack, String needle) {
        int l=needle.length();
        for(int i=0;i<haystack.length()-l+1;i++){
            String s=haystack.substring(i,i+l);
            if(s.equals(needle))
            return i;
        }
        
        return -1;
    }
}