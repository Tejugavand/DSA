package array;

import java.util.Scanner;
import java.util.Arrays;

public class even {
    public static void main(String[] args) {
        int size=10;
        int i=0;
        int[] arr=new int [size];
        for( i=0;i<size;i++){
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter array Number: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("even number");
        for (i=0; i<10; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
                
            }
           
        
        }
        
            

        

    }
}
    

