import java.util.*;

public class CombinationGenerator {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(1, n, k, new ArrayList<>(), result);
        return result;
    }

    void helper(int start, int n, int k, List<Integer> smallList, List<List<Integer>> bigList) {
        // Base case
        if (k == smallList.size()) {
            bigList.add(new ArrayList<>(smallList));
            return;
        }

        // Loop
        for (int i = start; i <= n; i++) {
            smallList.add(i);
            helper(i + 1, n, k, smallList, bigList);
            // Stack fall - backtrack
            smallList.remove(smallList.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationGenerator obj = new CombinationGenerator();
        List<List<Integer>> combinations = obj.combine(4, 2);
        System.out.println(combinations);
    }
}

