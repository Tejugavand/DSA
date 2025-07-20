public class patternTeju {
    public static void main(String[] args) {
        int n=5;
        int m=21;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1&&j<=5||j==3){
                    System.out.print(" * ");
                }
                else if(j==7||i==1&&j>=7 && j<=10){
                    System.out.print(" * ");
                }
                else if(j==7||i==3 &&j>=7 && j<=10){
                    System.out.print(" * ");
                }
                else if(j==7||i==5 &&j>=7 && j<=10){
                    System.out.print(" * ");
                }
                else if(i==1&&j>=12 && j<=16 ||j==14){
                    System.out.print(" * ");
                }
                else if(i==5&&j==12 || i==5 &&j==13){
                    System.out.print(" * ");
                }
                else if(i==5&&j==12 || i==5 &&j==13){
                    System.out.print(" * ");
                }
                else if(j==18 ||j==21||i==3&&j>=18||i==1&&j>=18){
                    System.out.print(" * ");
                }
                else if(j==6 &&i==1){
                    System.out.print("   ");
                }
                else if(j==11||j==11 &&i==1){
                    System.out.print("   ");
                }
                else if(j==17||j==17 &&i==1){
                    System.out.print("   ");
                }
                
                else{
                    System.out.print("   ");
                }
                
                
            }System.out.println();
        }
    }
    
    }
