import java.util.*;

public class Generatingsubset {

    static void generateSubsets(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {

        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current, result);
        current.remove(current.size() - 1);
        generateSubsets(arr, index + 1, current, result);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        List<List<Integer>> result = new ArrayList<>();

        generateSubsets(arr, 0, new ArrayList<>(), result);

        System.out.println("All Subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}