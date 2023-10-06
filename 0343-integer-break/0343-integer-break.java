class Solution {
    public int integerBreak(int n) {
        int a=n%3;
        int mul=1;
        if(n==2||n==3)
        return n-1;

        if(a==1){
           int b=(n/3)-1;
        
           return ((int)Math.pow(3,b))*2*2;
        }
        else{
            int b=(n/3);
            int c=a/2;
            return ((int)Math.pow(3,b))*(int)Math.pow(2,c);
        }
    }
}