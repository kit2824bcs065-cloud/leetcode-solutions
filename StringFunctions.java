import java.util.Scanner;
public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("Length of first string: " + str1.length());
        System.out.println("Length of second string: " + str2.length());
        String copy = str1;
        System.out.println("Copied string: " + copy);
        str1 = str2;
        System.out.println("After replacing first string with second string: " + str1);
        System.out.println("Uppercase string: " + str1.toUpperCase());
        String reverse = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);
        sc.close();
    }
}