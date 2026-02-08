package array.logic;

import java.util.Scanner;

public class evenodd {
    public static void oddeven(int[] arr){
        int j=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

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

            oddeven(arr);
        System.out.println("Array of zero and non zero:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }



}
}
    
