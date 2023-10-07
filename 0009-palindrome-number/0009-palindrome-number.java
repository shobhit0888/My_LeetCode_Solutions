class Solution {
    public boolean isPalindrome(int x) {
      if(x<0)
      return false;
       
       int y=0;
       int n=x;
       while(n>0){
           int digit=n%10;
           y=y*10+ digit;
           n=n/10;
       }
       if(y==x)
       return true;
       else
       return false;
    }
}