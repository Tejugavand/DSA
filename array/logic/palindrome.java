
package array.logic;
import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        int[] arr = {12,2,12};

        if (isPalindrome(arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }

    static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }
}
