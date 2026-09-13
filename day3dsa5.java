public class day3dsa5 {
    public static void main(String[] args) {
        int target=40;
        int[] arr = {10, 25, 7, 40, 18, 32};
        for (int i = 0; i < arr.length; i++)
            if(arr[i]==target) {
            
            System.out.println("target found at"+i);
            break;
            
        }
    }

    
}
