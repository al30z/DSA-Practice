class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet();
            List<Integer> result = new ArrayList();
            for (int i : nums) {
                if (!set.add(i)) {
                    result.add(i);
                }
            }
            return result;
        
    }
}
