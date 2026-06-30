import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println("Longest Substring Length = " + max);
    }
}