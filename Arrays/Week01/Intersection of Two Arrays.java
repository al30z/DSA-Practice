
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>(); // list to store and return output numbers

        //loop to save elements of nums 1 array in hashmap
        for (int num : nums1) {
            map.put(num, 1);
        }

        //now traverse through nums 2 and check which elements are present in both arrays
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, 0);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
