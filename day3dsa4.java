public class day3dsa4 {
    public static void main(String[] args) {
        int target=99;
        boolean found=false;
        int[] arr = {5, 12, 8, 21, 7, 30};
        for (int i =0; i < arr.length ; i++) {
            if (arr[i]==target) {
                found=true;
                System.out.println("INDEX NUMBER IS "+i);
                
            }
            
        }if(found){
            System.out.println();
        }else {
            System.out.println("not found");
        }
    }
    
}
