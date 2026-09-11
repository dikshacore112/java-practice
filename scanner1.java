import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=Sc.nextLine();

        System.out.println("Enter your age");
   int age=Sc.nextInt();

    System.out.println("Enter your Percentage");
    double percentage=Sc.nextDouble();
    
     
    
    System.out.println("hey! i m "+ name);
    System.out.println("and i m "+ age + " years old you old hag!");
    System.out.println("and my percentage for 9th is "+ percentage);


    }
}
