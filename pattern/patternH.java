public class patternH {
    public static void main(String[] args) {
        int n=5;
        int p=4;
        int m=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=p;j++){
                if(j==1 ||i==m||j==p){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    
}

    
