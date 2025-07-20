public class var2 {
    public static void main(String[] args) {
        int x =10;
        int y =3;
        x =++y - y-- + x-- * ++x;
        y = --y % ++x + x++;
        System.out.println(x);
        System.out.println(y);
    }
    
}
