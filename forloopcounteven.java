import java.util.Scanner;

public class forloopcounteven {
    public static void main(String[] args){
        int start,end;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start");
        start = sc.nextInt();

        System.out.println("enter the end");
        end= sc.nextInt();
 
        int count=0;
        System.out.println("total count of even number");
        
        for (i=start; i<=end; i++){
            if(i%2==0)
            {
            count++;
            sc.close();
            }
    }
                System.out.println(count);


    
}
}

    

