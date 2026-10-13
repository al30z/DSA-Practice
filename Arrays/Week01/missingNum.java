class Solution {
    public int missingNumber(int[] nums) {
        //find sum of all elements in array provided
        int sum =0;
        for (int i = 0;i<nums.length;i++){
            sum += nums[i];
            
        }
        //now calculate actual sum = n(n+1)/2
        int actualSum= (nums.length*(nums.length+1))/2;
        //so missing number is actualSum - sum
        int missingNum = actualSum - sum;

        return missingNum;
        
    }
}
