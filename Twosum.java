/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta.el.reto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
 * nums[1] == 9, we return [0, 1].
 *
 * @author losga
 */
public class Twosum {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(towsuma(new int[]{3, 2,4}, 6)));
    }
    
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        
        return null;
    }

    // with hashmap
    public static int[] towsuma(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // the first step is to put the nums into the hashMap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int operation = target - nums[i];
            if (map.containsKey(operation) && map.get(operation) != i) {
                return new int[]{i, map.get(operation)};
            }
        }
        
        return null;
    }
}
