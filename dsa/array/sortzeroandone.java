package dsa.array;
import java.util.Scanner;
import java.util.Arrays;

public class sortzeroandone {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }System.out.println("the array is: "+Arrays.toString(arr));

        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right++;
                left--;
            }
            
           
        }System.out.println("sorted array is"+Arrays.toString(arr));
        
    }
    
}
