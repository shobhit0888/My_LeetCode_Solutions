class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = n; // Initialize the answer to the length of the input array
        Arrays.sort(nums); // Sort the input array in ascending order
        int m = 1; // Initialize a variable to keep track of unique elements count
        int j = 0;

        // Loop to find unique elements and count them
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[m] = nums[i]; // Store unique elements at the beginning of the array
                m++; // Increment the count of unique elements
            }
        }

        // Iterate through unique elements to calculate the minimum operations
        for (int i = 0; i < m; i++) {
            while (j < m && nums[j] < nums[i] + n) {
                j++; // Move the 'j' pointer until the condition is met
            }
            // Calculate and update the minimum operations
            ans = Math.min(ans, n - j + i);
        }

        return ans; // Return the minimum operations required
    }
}