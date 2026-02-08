package array.logic;
import java.util.Arrays;
import java.util.Scanner;

public class nonzeroandone1 {
    public static void zeroandone(int[] arr,int start,int end){
            while(start<end){
            if(arr[start]==0){
                start++;
            }
            else if(arr[end]!=0){
                end--;
            }
            else{
                arr[start]=arr[start]+arr[end];
                arr[end]=arr[start]-arr[end];
                arr[start]=arr[start]-arr[end];
                start++;
                end--;

            }
        }
    }

    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        zeroandone(arr,0,n-1);
        System.out.println("Array of zero and non zero:"+ Arrays.toString(arr));
        



}
    
}
