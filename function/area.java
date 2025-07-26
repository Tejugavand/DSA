package function;

public class area {
    public static int rect(int l ,int b){
        return l*b;
        }
    public static int square(int l ){
        return l*l;
        }
    public static double traingle(int l,int h ){
        return 0.5*l*h;
        }
    public static double circle(int r ){
        return 3.14*r*r;
        }

    

        public static void main(String[] args) {
            int area=rect(5,4);
            System.out.println("area of rectangle:" +area);

            int area1=square(5);
            System.out.println("area of square:" +area1);

            double area2=traingle(2,5);
            System.out.println("area of triangle:" +area2);

            double area3=circle(2);
            System.out.println("area of circle:" +area3);




        }
    
}
