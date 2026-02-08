package array.logic;
import java.util.Scanner;
import java.util.Arrays;

public class repeatedelement {

    public static void main(String[] args) {
        
        int[] arr = {3, 5, 7, 5, 8, 3, 9};

        System.out.println("Repeated elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; 
                }
            }
        }
    }

}   
            

