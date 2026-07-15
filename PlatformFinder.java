import java.util.Arrays;

public class PlatformFinder {

    public static int minPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 0, j = 0;
        int platforms = 0, maxPlatforms = 0;

        while (i < arrival.length && j < departure.length) {
            if (arrival[i] <= departure[j]) {
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {1, 3, 5};
        int[] departure = {2, 6, 8};

        System.out.println(minPlatforms(arrival, departure));
    }
}