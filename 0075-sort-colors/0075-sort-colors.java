class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==0)
            a++;
            else if(nums[i]==1)
            b++;
            else
            c++;
        }
        for(int i=0;i<l;i++){
            if(a>0){
                nums[i]=0;
                a--;
            }
            else if(b>0){
                nums[i]=1;
                b--;
            }
            else{
                nums[i]=2;
                c--;
            }
        }
    }
}