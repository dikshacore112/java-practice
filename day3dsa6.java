public class day3dsa6 {
    public static void main(String[] args) {
        int target=7;
        int count=0;
    int[] arr = {4, 7, 2, 7, 9, 7, 3};    
    for (int i = 0; i < arr.length; i++) {
        
        if (arr[i]==target) {
            count=count+1;

        }
    }
    System.out.println(count);
}
    
}
