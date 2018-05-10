package arrays;

public class LeetCodeSolution1 {

    static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 4, 3, 90 };
        int target = 0;
        int[] res = twoSum(arr, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}

