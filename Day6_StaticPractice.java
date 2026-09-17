public class Day6_StaticPractice {
    public static void greet(){
    System.out.println("i m static");
}

public void tell(){
System.out.println("i m  non static");
}
public static void main(String[] args) {
greet();
    Day6_StaticPractice obj=new Day6_StaticPractice();
    obj.tell();
}
}
