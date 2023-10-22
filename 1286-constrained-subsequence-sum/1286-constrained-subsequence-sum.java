class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int[] maxTillThis = nums.clone();
        Deque<Integer> maxSbSqUptSzK = new ArrayDeque<>();
        int res = maxTillThis[0];
        for (int indx = 0; indx < maxTillThis.length; ++indx) {
            maxTillThis[indx] += maxSbSqUptSzK.size() > 0    ? maxTillThis[maxSbSqUptSzK.peekFirst()] : 0;
            res = Math.max(res, maxTillThis[indx]);
            while (!maxSbSqUptSzK.isEmpty() && maxTillThis[indx] > maxTillThis[maxSbSqUptSzK.peekLast()]) {
                maxSbSqUptSzK.removeLast();
            }
            if (maxTillThis[indx] > 0) {
                maxSbSqUptSzK.addLast(indx);
            }
            if (indx >= k && !maxSbSqUptSzK.isEmpty() && maxSbSqUptSzK.peekFirst() == indx - k) {
                maxSbSqUptSzK.removeFirst();
            }
        }
        return res;
    }
}