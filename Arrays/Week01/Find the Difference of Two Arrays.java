import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //loop to save elements of nums 1 array in hashmap
        for (int num : nums1) {
            set1.add(num);
        }

        //loop to save elements of nums 2 array in hashmap
        for (int num : nums2) {
            set2.add(num);
        }

        //now traverse through nums 1 and check which elements are not present in nums 2
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        //now traverse through nums 2 and check which elements are not present in nums 1
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        result.add(list1);
        result.add(list2);

        return result;
    }
}
