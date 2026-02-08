package recursion;

public class displaynum {
    public static void display(int start, int end){
        if (start>10){
            return;
        }
        System.out.println(start);
        display(start+1, end);

    }
    public static void main(String[] args) {
        display(1,10);
    }
    
}
