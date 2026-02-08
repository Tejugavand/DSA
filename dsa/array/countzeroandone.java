package dsa.array;
import java.util.Scanner;
import java.util.Arrays;

public class countzeroandone {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int zerocount=0;
        int onecount=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zerocount++;
            }
            else{
                onecount++;
            }
        }
        System.out.println("zero count is: "+zerocount);
        System.out.println("one count is: "+onecount);

    }
    
}
//time complexity=O(n)
//space compplexiity =O(1)
