/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta.el.reto;

/**
 *
 * @author Alfred
 */
/**
 * Given an array nums, partition it into two (contiguous) subarrays left and
 * right so that:
 *
 * Every element in left is less than or equal to every element in right. left
 * and right are non-empty. left has the smallest possible size. Return the
 * length of left after such a partitioning. It is guaranteed that such a
 * partitioning exists.
 *
 * Example 1:
 *
 * Input: nums = [5,0,3,8,6] Output: 3 Explanation: left = [5,0,3], right =[8,6]
 */
public class PartitionArray {

    public static void main(String[] args) {
        System.out.println(partitionDisjoint(new int[]{5,0,3,8,6}));
    }
    
    public static int partitionDisjoint(int[] nums) {
       int res = 0;
       int maxLeft = nums[0];
       int maxRight = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < maxLeft) {
                maxLeft = maxRight;
                res = i;
            }else if(maxRight < nums[i]){
                maxRight = nums[i];
            }
            
        }
        
        return  res + 1;
    }
    
}
