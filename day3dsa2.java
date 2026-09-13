public class day3dsa2  {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 18, 32};
        int target=99;
boolean f=false;
        for (int i = 0; i < arr.length; i++) {
       
            if (arr[i]==target) {
                f=true;

            } 
        }
         if (f)
            { System.out.println("found");
        }else{
            System.out.println("not found");
        }
                
            }
             
                
            
            
        }
    
    


    

