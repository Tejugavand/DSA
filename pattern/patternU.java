public class patternU {
    public static void main(String[] args) {
        int n=4;
        int m=4;
         for(int i=1;i<=n;i++){
            for(int j=1;j<m;j++){
                if(j==1||j==3||i==m){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    
    }
    

