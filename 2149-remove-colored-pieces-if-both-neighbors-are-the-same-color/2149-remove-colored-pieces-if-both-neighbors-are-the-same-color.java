class Solution {
    public boolean winnerOfGame(String colors) {
        int count1=0,count2=0,a=0,b=0;
        for(int i=0;i<colors.length();i++){
         char ch=colors.charAt(i);
         if(ch=='A'){
             count2=0;
             count1++;
             if(count1>=3){
                 a++;
             }
         }
         if(ch=='B'){
             count1=0;
             count2++;
             if(count2>=3){
                 b++;
             }
         }
        }
        if(a>b)
        return true;
        else
        return false;
    }
}