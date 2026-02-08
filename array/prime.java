package array;

import java.util.Scanner;

public class prime {
     public static void main(String[] args) {
        int size=10;
        int i=0;
        int[] arr=new int [size];
        for( i=0;i<size;i++){
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter array Number: ");
            arr[i]= sc.nextInt();
        }
        int sum=0;
        System.out.println("prime number");
        for (i=0; i<10; i++){
            if(sum%arr[i]==0){
                sum++;
                
            }
           
        
        } if(sum==2){
            System.out.println(sum);
        }
        else{
            System.out.println("not prime");
        }
        
        
    }
}
    
