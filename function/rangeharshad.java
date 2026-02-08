package function;

import java.util.Scanner;

public class rangeharshad {
    public static int isharshad(int n){
        int sum=0;

        while(n>0){
            int rem=n%10;
            System.out.println(rem +" " );
            sum=sum+rem;
            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the start number");
        int start= sc.nextInt();
        System.out.println("enter the end number");
        int end= sc.nextInt();
        

        for(int i =start;i<=end;i++){
        if(isharshad(i)==i){
            System.out.println(i+ ":harshad number");
        }
        else{
            System.out.println(i+ " not harshad number");
        }

    }

    }
    
}

    
