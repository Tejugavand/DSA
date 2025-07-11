import java.util.Scanner;

public class forloopsum {
    public static void main(String args[]){
        int start,end;
        int i;
        

    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start");
        start = sc.nextInt();
        System.out.println("enter the end");
        end= sc.nextInt();
        
        
        int sum=0;
        System.out.println("total count");
        for (i=start; i<=end; i++){
            sum =sum+i;
            
                sc.close();
            
        }
                System.out.println(sum);


    
}
}
