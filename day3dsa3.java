public class day3dsa3 {
    public static void main(String[] args) {
        int target=99;
        boolean found=false;
        int[] arr = {10, 25, 7, 40, 18, 32};
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]==target) {
found=true;
                System.out.println ("found at index "+i);
                
            }
            
        }
        if(found){
            System.out.println("found");

        }else {
            System.out.println("notfound");
        }
    }
    
}
