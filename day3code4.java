public class day3code4 {
    public static boolean isEven(int n){
        if (n%2==0) {
            return true;
            
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean r=isEven(10);
        if (r) {
            System.out.println("true");
            
        } else {
            System.out.println("false");
        }
    }
}
