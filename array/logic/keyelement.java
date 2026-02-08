package array.logic;
import java.util.Scanner;
public class keyelement {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];


        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

    
        System.out.print("Enter the key element to search: ");
        int key = sc.nextInt();

        
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Key " + key + " found at index " + i);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("Key " + key + " not found in the array.");
        }

        sc.close();
    }
}

    

