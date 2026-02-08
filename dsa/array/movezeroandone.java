package dsa.array;
import java.util.Scanner;
import java.util.Arrays;

public class movezeroandone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n=sc.nextInt();
        int arry[]=new int[n];
        System.out.println("enter the element :");
        
        for(int i=0;i<n;i++){
            arry[i]=sc.nextInt();
        }System.out.println("array is: "+Arrays.toString(arry));

        int left=0;
        int right=arry.length-1;
         while(left<right){
            if(arry[left]==0){
                left++;
            }
            else if(arry[right]==1){
                right--;
            }
            else{
                int temp=arry[left];
                arry[left]=arry[right];
                arry[right]=temp;
                right++;
                left--;
            }
            
           
        }System.out.println("sorted array is"+Arrays.toString(arry));
        
    }
}
