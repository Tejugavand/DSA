package array.logic;
import java .util.Scanner;

public class leftrotatby1 {
    public static void isrotatbyone(int[] arr){

        int temp=arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
            
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array:" );
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the " +n+  "elemnts");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        isrotatbyone(arr);

        
        System.out.println("Array after left rotation by one place:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    }

