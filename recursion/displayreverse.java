package recursion;

public class displayreverse {
   public static void display(int start, int end){
        if (start<1){
            return;
        }
        System.out.println(start);
        display(start-1, end);

    }
    public static void main(String[] args) {
        display(10,1);
    }
}
