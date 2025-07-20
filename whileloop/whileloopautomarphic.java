import java.util.Scanner;

public class whileloopautomarphic {public static void main(String[] args) {
        int n;
        int rem=1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        
        
        int square=n*n;
        
        System.out.println("square is");
        System.out.println(square);
        int flage=0;
        while(n>0){
            rem=n%10;
            square=square%10;

            if(rem!=square){
                flage=1;
                break;
            }
            
            n=n/10;

            
        }
        if(flage==0){
                System.out.println("automarphic");
            }

            else{
                System.out.println("not automarphic number");


            }
        
        
        
        
        
        
    
}
}

    

