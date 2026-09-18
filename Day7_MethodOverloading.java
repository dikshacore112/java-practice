public class  Day7_MethodOverloading {
    public static int add(int a,int b){
        return a +b;
    }public static double add(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[]args){
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5, 78.8));
    }
}