public class patternC {
    public static void main(String[] args) {
        int n=5;
        
        int m=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 ||i==1||i==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    
}

