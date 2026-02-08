package array.logic;
import java.util.Scanner;
public class occurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[size];

        System.out.println("\nElement occurrences:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue; 
            }

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

            System.out.println(arr[i] + " = " + count );
        }

        sc.close();
    }
}

    

