import java.util.Scanner;

public class letter {
    
    public static void main(String[] args){
        char let;

    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char:");
        let = sc.next().charAt(0);

        if(let =='a'|| let =='e'||let =='i'|| let =='o'|| let =='u'){
            System.out.println("vowel");

        }
        else{
            System.out.println("consonout");
        }
        sc.close();
    
}
    
}
