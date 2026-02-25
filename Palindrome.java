package Sapthagiri1;
import java.util.Scanner;
public class Palindrome{
    static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        if (isPalindrome(word))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
    }
}