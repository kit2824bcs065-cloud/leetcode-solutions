public class GFG {

    static int lowerBound(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= target) {
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;

        System.out.println(lowerBound(arr, target));
    }
}