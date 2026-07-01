import java.util.*;

public class Permutation {

    static List<List<Integer>> result = new ArrayList<>();

    static void backtrack(int[] nums, boolean[] used, List<Integer> path) {

        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            used[i] = true;
            path.add(nums[i]);

            backtrack(nums, used, path);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>());

        System.out.println("All Permutations:");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}