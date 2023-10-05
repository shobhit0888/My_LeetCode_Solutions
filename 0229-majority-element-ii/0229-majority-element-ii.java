class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int l=nums.length;
        List<Integer> ll=new ArrayList<Integer>();
        HashMap<Integer,Integer> hp=new HashMap();
        for(int i=0;i<l;i++){
            if(hp.containsKey(nums[i]))
            hp.put(nums[i],hp.get(nums[i])+1);
            else
            hp.put(nums[i],1);
        }
        int a=(l/3)+1;
        for(int i=0;i<l;i++){
            
            if(hp.get(nums[i])>=a){
                ll.add(nums[i]);
                hp.put(nums[i],0);
            }
        }
        return ll;
    }
}