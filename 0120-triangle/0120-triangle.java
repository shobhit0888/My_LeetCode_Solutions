class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int l=triangle.size();
        for(int i=l-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int a=triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,a);
            }
        }
        return triangle.get(0).get(0);
    }
}