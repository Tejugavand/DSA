package dsa.array;
import java.util.Scanner;
import java.util.Arrays;

public class secondlargest {
    public static int find(int[]arr){
        int largestelement=Integer.MIN_VALUE;
        int secondlargestelement=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num>largestelement){
                secondlargestelement=largestelement;
                largestelement=num;

            }
            else if(num>secondlargestelement &&num!=largestelement){
                secondlargestelement=num;
            }
        }return secondlargestelement;


    }
    public static void main(String[] args) {
        int arr[]={20,44,99,40,99,10};
        System.out.println("second largest element is: "+find(arr));
    }
    
}
