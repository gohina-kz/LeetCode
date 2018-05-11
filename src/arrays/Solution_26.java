package arrays;

import java.util.HashMap;

public class Solution_26 {

     static int removeDuplicates(int[] nums) {
        int len = 0;

         HashMap<Integer, Integer> map = new HashMap<>();

         for (int i = 0; i < nums.length; i++) {
             if (!map.containsKey(nums[i])) {
                 map.put(nums[i], 1);
                 nums[len] = nums[i];
                 len++;
             }
         }

        return len;
    }

     static int removeDuplicates_2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

         int[] nums = {0,0,1,1,1,2,2,3,3,4};

         System.out.println(removeDuplicates(nums));


    }

}
