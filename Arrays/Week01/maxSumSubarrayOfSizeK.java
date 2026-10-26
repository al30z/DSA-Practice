class Solution {
    public long maximumSumSubarray(int k, int[] Arr, int N) {
        long windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += Arr[i];
        }

        long maxSum = windowSum;
        for (int i = k; i < N; i++) {
            windowSum += Arr[i] - Arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}