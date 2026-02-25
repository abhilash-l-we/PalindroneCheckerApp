import java.util.Scanner;

class RecursivePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        sc.close();
    }

    // Recursive method
    static boolean checkPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters do not match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return checkPalindrome(str, start + 1, end - 1);
    }
}