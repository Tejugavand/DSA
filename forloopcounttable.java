import java.util.Scanner;
public class forloopcounttable {
    public static void main(String[] args){
        
        int i;
        int n;

    
        Scanner sc = new Scanner(System.in);
        

        System.out.println( "enter the numbers");
        n = sc.nextInt();
        int count=0;
        

        for (i=1; i<=10; i++){
            
            System.out.println(i*n);
            count++;
            System.out.println(count);
            sc.close();
            
            }
            
            

            
            
        }
        

        
        
    
}
    


    