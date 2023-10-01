import java.util.*;
class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        String str="";
        String ss="";
        for(int i=0;i<ch.length;i++){
          if(ch[i]==' '){
               str=str+ss+" ";
               ss="";
          }
          else{
            ss=ch[i]+ss;
          }
        }
        str=str+ss;
        return str;
    }
}