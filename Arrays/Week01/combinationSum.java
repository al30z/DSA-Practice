import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] candidates, int target, 
                           List<Integer> current, List<List<Integer>> result) {
        
        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // Pick the element (can reuse same index)
        current.add(candidates[index]);
        backtrack(index, candidates, target - candidates[index], current, result);

        // Backtrack (remove last added element)
        current.remove(current.size() - 1);

        // Skip the element (move to next index)
        backtrack(index + 1, candidates, target, current, result);
    }
}
