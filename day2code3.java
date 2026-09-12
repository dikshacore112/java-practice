public class day2code3 {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {12, 45, 7, 89, 23, 18, 20, 31};
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                odd=odd+1;
sum=sum+arr[i];
                
            }
        }
        
        System.out.println("sum is: "+sum);
    }
    
}
