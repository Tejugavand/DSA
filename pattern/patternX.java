public class patternX {
    public static void main(String[] args) {
        
    
    int n=5;
        
        int m=(n/2)+1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-i-1||j ==i){
                    System.out.print("*");
                }
                
                else {
                    System.out.print (" ");
                }
            }System.out.println();
        }
    }
    
}
    

