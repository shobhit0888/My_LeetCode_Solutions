class Solution {
    public String reverseWords(String s) {
         String str="";
         String ss="";
       for(int i=0;i<s.length();i++){
           if(Character.isWhitespace(s.charAt(i))){
             str=str+ss+" ";
             ss="";
           }
           else{
               ss=s.charAt(i)+ss;
           }
       }
       str=str+ss;
       return str;
    
    }
}