class vehicle{
    
    void start(){
        System.out.println("vehicle starts");
    }
    }
     class car extends vehicle{
        @Override 
        void start(){
            System.out.println("car is driving");
        }
        void drive(){
            System.out.println("car starts with a key");
        }
    }
    public class override {
            public static void main(String[] args) {
        
        car c=new car();
        c.start();
        c.drive();
            }
        }





















