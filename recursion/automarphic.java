package recursion;

import java.util.Scanner;

public class automarphic {
    public static int isAutomorphic(int n,int rem,int square) {
        
        
        if(square==0){
            return rem;
        }

        
            rem=n%10;
            if(rem!=square%10){
            
                break;
            }
            n =n/ 10;
            
        }
        return isAutomorphic();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        int square = n * n;

        int flag = isAutomorphic(n);
        if (flag == 0) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");
        }
    }
}
    
