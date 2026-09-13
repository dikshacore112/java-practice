public class day3dsa9 {
    public static void main(String[] args) {
        
        int[] arr = {34, 12, 89, 45, 67, 23};
int largest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest=arr[i];
                
            }
        }
            System.out.println(largest);
        
    }
    
}
