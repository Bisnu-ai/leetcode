import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : arr) {
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : arr) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }
}
