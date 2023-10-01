import java.util.StringTokenizer;  
class Solution {
    String str="";
    public String reverseWords(String s) {
       StringTokenizer st = new StringTokenizer(s," "); 
       
       int count =st.countTokens();
       while(st.hasMoreTokens()){
           String ap=st.nextToken();
           reverse(ap);
           count--;
           if(count!=0)
           str=str+" ";
           
       }
       return str;
    }
    void reverse(String s){
        for(int i=s.length()-1;i>=0;i--){
            str =str +s.charAt(i);
        }
    }
}