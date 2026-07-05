import java.util.*;

public class MinOperations {

    public int minOperations(String s1, String s2) {
        int n = s1.length();

        if (n == 1) {
            if (s1.equals(s2))
                return 0;
            return s1.charAt(0) == '0' ? 1 : -1;
        }

        long total = 0;
        int i = 0;

        while (i < n) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a == '0' && b == '1') {
                total += 1;
                i++;
            } else if (a == '1' && b == '0') {
                int j = i;
                while (j < n && s1.charAt(j) == '1' && s2.charAt(j) == '0') {
                    j++;
                }

                int k = j - i;
                total += k / 2;
                if (k % 2 == 1)
                    total += 2;

                i = j;
            } else {
                i++;
            }
        }

        return (int) total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        MinOperations obj = new MinOperations();
        System.out.println(obj.minOperations(s1, s2));

        sc.close();
    }
}