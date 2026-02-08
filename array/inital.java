package array;
import java.util.Scanner;
import java.util.Arrays;
public class inital {
    public static void main(String[] args) {
        int size=4;
        int[] arr=new int [size]; 

        for(int i=0;i<size;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array Number: ");
            arr[i]= sc.nextInt();
        
        }
        
            System.out.print("arrays is :" +Arrays.toString(arr));
            

    }
    
}
