class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()<=i)
                return str;
                if(ch!=strs[j].charAt(i)){
                    return str;
                }
            }
            str=str+ch;
        }
        return str;
    }
}