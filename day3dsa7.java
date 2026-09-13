public class day3dsa7 {
    public static void main(String[] args) {
        int target=1;
        boolean found=false;
        int[] arr = {8, 3, 5, 3, 9, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                found=true;
                System.out.println(i);
                break;
                
            }
            
        }
        if(found){
            System.out.println("target found");
        }else{
            System.out.println("not found");
        }

    }
    
}
