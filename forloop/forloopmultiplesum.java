import java.util.Scanner;

public class forloopmultiplesum {
    public static void main(String[] args){
        
        int i;
        int n;

    
        Scanner sc = new Scanner(System.in);
        

        System.out.println( "enter the numbers");
        n = sc.nextInt();
        int sum=0;;
        
        for (i=1; i<=10; i++){
            
            System.out.println(i*n);
            {
                sum =sum+i*n;
                sc.close();

            }
            
            }
            System.out.println(sum);
            

            
    }

}
    

