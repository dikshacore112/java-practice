public class Day7_MethodOverloading2 {
    public static String display(String name){
        return  "Hello, "+name;
    }
    public static String display(int age){
        return "I am " + age + " years old.";
    }

    public static void main(String[]args){
        System.out.println(display("Diksha"));
        System.out.println(display(20));
    }
    
}
