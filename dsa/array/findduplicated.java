package dsa.array;
import java.util.Scanner;
import java.util.Arrays;

public class findduplicated {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];

    System.out.println("enter the element");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("the array is"+Arrays.toString(arr));
    //Arrays.sort(arr);
    int left=0;
    int right=1;
    while(right<arr.length){
        if(arr[left]==arr[right]){
            System.out.println("duplicates:"+arr[right]);
            break;

        }
        else{
            left++;
            right++;
        }
        
    }

    }
    
}
