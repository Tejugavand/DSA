package array.logic;

import java.util.Scanner;

public class missingnum1 {
    public static int ismissing(int [] arr, int n){
    for(int i=1;i<=5;i++){
       int flag=0;
        for(int j=1;j<=5;j++){
            if(arr[j]==i){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return -1;
        
    }
}
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

    
}
}