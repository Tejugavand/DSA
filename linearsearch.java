package dsa.array;
import java.util.Scanner;
import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();

        int arr[]=new int[5];
        System.out.println("enter the element:");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    
}
