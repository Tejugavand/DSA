public class patternreverse {
    public static void main(String[] args) {
        
    
    int i;
        
    for ( i=0;i<3;i++){
            for(int j=3;j<3+i+1;j++){
                System.out.print(" ");
            }
                for(int k=3;k>i;k--){
                    System.out.print(" * ");
                }

                System.out.println();
        }
        
    }
}
    

