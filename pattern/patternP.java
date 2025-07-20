public class patternP {
    public static void main(String[] args) {
        int n=5;
        int p=3;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=p;j++){
                if(j==1||i==1||i==3||j==p &&i==2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    
}
