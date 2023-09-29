class Solution {
    public void nextPermutation(int[] arr) {
        int pos=0,temp=arr[0],index=0,flag=0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                pos=i-1;
                temp=arr[i-1];
                flag=1;
                break;
            }
        }
        int max= arr[pos];
        for(int i=pos+1;i<arr.length;i++){
            if(arr[i]>temp&&arr[i]<=max){
            max=arr[i];
            index=i;
            }
            else{
                if(arr[i]>temp)
                {
                   max=arr[i];
            index=i; 
                }
            }
            
        }
        arr[pos]=arr[index];
        arr[index]=temp;
        if(flag==0)
        pos=pos-1;

        for(int i=pos+1;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }System.out.print("["+arr[0]);
        for(int i=0;i<arr.length;i++){
            System.out.print(","+arr[i]);
        }
        System.out.print("]");
    }
}