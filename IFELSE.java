import java.util.Scanner;
public class IFELSE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int NUMBER=sc.nextInt();
        if (NUMBER >=0) {
            System.out.println("THE NUMBER IS POSITIVE");
        }    
            else{
                System.out.println("THE NUMBER IS NEGATIVE");
            }
        }
}

