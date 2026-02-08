package function;

import java.util.Scanner;

public class factorofnumber {
    public static int factor(int n){
        int factor=1;
        int i;
        for (i=1; i<n; i++){
            if(n%i==0){
                factor=i;
                System.out.println(factor);
                
            }
        }
        return factor=i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

        int result=factor(n);
        sc.close();
        
    }
    }




    
