package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution_350 {


    static int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int k = 0; k < nums2.length; k++) {
                if (nums1[i] == nums2[k] && !map.containsKey(nums1[i])) {
                    map.put(nums1[i], 1);
                    arr.add(nums1[i]);
                    nums2[k] = -1;
                }
            }

        }

        int[] res = new int[arr.size()];
        int a = 0;
        for (Integer num : arr) {
            res[a] = num;
            a++;
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] nums1_ = {1};
        int[] nums2_ = {1, 1};

        int[] res = intersect(nums1_, nums2_);

        for (int i : res) {
            System.out.println(i);
        }
    }

}
