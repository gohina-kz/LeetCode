package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution_349 {

    static int[] intersection_(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int k = 0; k < nums2.length; k++) {
                if (nums1[i] == nums2[k] && !map.containsKey(nums1[i])) {
                    map.put(nums1[i], 1);
                }
            }
        }

        int[] res = new int[map.size()];
        int a = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            res[a] = pair.getKey();
            a++;
        }

        return res;

    }

    static int[] intersection(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 > len2) {
            return intersection_(nums1, nums2);
        }

        return intersection_(nums2, nums1);

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = intersection(nums1, nums2);

        for (int i : res) {
            System.out.println(i);
        }

    }

}
