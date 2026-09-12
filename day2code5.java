public class day2code5 {
    public static void main(String[] args) {
        int[] arr = {25, 67, 42, 89, 51, 13, 76};
        int count=0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>50) {
                count=count+1;
            }

        }System.out.println(count);
    }
    
}
