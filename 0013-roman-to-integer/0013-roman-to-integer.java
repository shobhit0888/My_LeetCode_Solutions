class Solution {
    public int romanToInt(String s) {
        int num=roman(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            char ch=s.charAt(i);
            char c=s.charAt(i+1);
            int a =roman(ch);
            int b=roman(c);
            if(a<b){
                num=num-a;
            }
            else{
                num=num+a;
            }
        }
        return num;
    }
    int roman(char ch){
        int num=0;
switch(ch){
                case 'I':
                num=1;
                break;
                case 'V':
                num=5;
                break;
                case 'X':
                num=10;
                break;
                case 'L':
                num=50;
                break;
                case 'C':
                num=100;
                break;
                case 'D':
                num = 500;
                break;
                case 'M':
                num = 1000;
                break;
            }
            return num;
    }
}