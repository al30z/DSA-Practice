import java.util.HashMap;
import java.util.Map;

public class Solution904 {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Expand window by adding current fruit
            int currentFruit = fruits[right];
            basket.put(currentFruit, basket.getOrDefault(currentFruit, 0) + 1);

            // Shrink window if basket holds more than 2 types of fruit
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++;
            }

            // Record maximum window size achieved
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}