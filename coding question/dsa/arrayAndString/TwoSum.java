package dsa.arrayAndString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    
    public List<int[]> findAllTwoSumPairs(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in map
            if (numMap.containsKey(complement)) {
                // Add all pairs with current number and previous complements
                for (int prevIndex : numMap.get(complement)) {
                    result.add(new int[]{prevIndex, i});
                }
            }
            
            // Add current number to map
            numMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, -4, 8, 11};
        int target = 7;
        
        TwoSum twosum = new TwoSum();
        List<int[]> pairs = twosum.findAllTwoSumPairs(arr, target);
        
        if (pairs.isEmpty()) {
            System.out.println("No pairs found that sum to " + target);
            
        } else {
            System.out.println("All pairs that sum to " + target + ":");
            for (int[] pair : pairs) {
                System.out.printf("Indices: %s, Values: %d + %d = %d%n",
                    Arrays.toString(pair),
                    arr[pair[0]],
                    arr[pair[1]],
                    arr[pair[0]] + arr[pair[1]]
                );
            }
            System.out.println("Total number of pairs found: " + pairs.size());
        }
    }
}