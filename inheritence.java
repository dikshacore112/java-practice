class vehicle{
    void start(){
        System.out.println("vehicle starts");
    }
    }
     class car extends vehicle{
        void drive(){
            System.out.println("car is driving");
        }
    }
    public class inheritence {
            public static void main(String[] args) {
        
        car c=new car();
        c.start();
        c.drive();
}
    }