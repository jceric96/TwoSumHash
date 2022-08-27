import java.util.HashMap;

public class TwoSumHash {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }

        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        TwoSumHash twosum = new TwoSumHash();
        int[] res = twosum.twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
