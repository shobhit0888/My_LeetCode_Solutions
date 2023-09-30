class Solution {
    public boolean find132pattern(int[] nums) {
      if (nums.length < 3) {
            return false;
        }
        
        int n = nums.length;
        int[] minArray = new int[n];
        minArray[0] = nums[0];
        
        // Create an array to store the minimum value to the left of each element.
        for (int i = 1; i < n; i++) {
            minArray[i] = Math.min(minArray[i - 1], nums[i]);
        }
        
        Stack<Integer> stack = new Stack<>();
        
        // Iterate from right to left in the nums array.
        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > minArray[j]) {
                // If nums[j] is greater than the minimum value to its left,
                // then there's a potential 132 pattern.
                while (!stack.isEmpty() && stack.peek() <= minArray[j]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }
                stack.push(nums[j]);
            }
        }
        
        return false;

    }
}