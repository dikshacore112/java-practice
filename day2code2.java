public class day2code2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 18, 20, 31};
        int even=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even=even+1;
                
            }
            
        }
        System.out.println("the even number is: "+even);
    }
    
}
