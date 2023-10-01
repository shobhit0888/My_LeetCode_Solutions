class Solution {
    public String reverseWords(String s) {
         String str="";
         String ss="";
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(Character.isWhitespace(ch)){
             str=str+ss+" ";
             ss="";
           }
           else{
               ss=ch+ss;
           }
       }
       str=str+ss;
       return str;
    
    }
}