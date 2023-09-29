class Solution {
    public boolean isSubsequence(String s, String t) {
        int count =s.length();
        int i=0,j=0;
      while(count >0&&j<t.length()){
          if((s.charAt(i))==(t.charAt(j))){
              count --;
              i++;
              j++;
          }
          else{
          j++;
          }
      }
      if(count!=0)
      return false;
      else
      return true;  
    }
}