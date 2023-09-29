class Solution {
    public boolean isMonotonic(int[] arr) {
        int l=arr.length;
        if(l==1)
        return true;
        else{
            int k= arr[0]-arr[l-1];
            if(k>=0){
                for(int i=0;i<arr.length-1;i++){
                    if(arr[i]<arr[i+1])
                    return false;

                }
                return true;
            }
            else{
                 for(int i=0;i<arr.length-1;i++){
                    if(arr[i]>arr[i+1])
                    return false;

                }
                 return true;
            }
           
        }
    }
}