public class Triplet {
    public static void main(String[] args) {

        int[] arr = {1, 2, -1, 0, 2, 1};
        int target = 3;

        boolean found = false;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("Triplet: " + arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No Triplet Found");
        }
    }
}