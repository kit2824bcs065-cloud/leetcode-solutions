import java.util.Scanner;

public class string {

    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        string obj = new string();
        System.out.println(obj.strStr(haystack, needle));

        sc.close();
    }
}