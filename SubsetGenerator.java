import java.util.*;

public class SubsetGenerator {

    public static void main(String[] args) {
        int[] nums = {1, 2,3};
        List<List<Integer>> result = subsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> bigList = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), bigList);
        return bigList;
    }

    private static void helper(int[] nums, int index, List<Integer> smallList, List<List<Integer>> bigList) {
        // Add the current subset to the final result
        bigList.add(new ArrayList<>(smallList));

        // Traverse the nums array starting from the current index
        for (int i = index; i < nums.length; i++) {
            // Add current number to smallList
            smallList.add(nums[i]);

            // Recursively call helper with updated index
            helper(nums, i + 1, smallList, bigList);  // Use i + 1 to move forward

            // Backtrack: remove the last element added
            smallList.remove(smallList.size() - 1);
        }
    }
}
