package array.logic;
import java.util.Arrays;
import java.util.Scanner;
public class sorted {
    public static boolean issorted(int [] arr){
        for(int i=1;i<arr.length;i++){

            //ccondition
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // size 
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         if(issorted(arr)){
            System.out.println("array is sorted:");
         }
         else{
            System.out.println("array is not sorted");
            System.out.println("Sorting the array...");
            Arrays.sort(arr);

            
            System.out.println("Sorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
         }


    }
    
}
}
