public class day2code6 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 67};
        int largest=arr[0];
        int slargest=arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                slargest=largest;
                largest=arr[i];
            }else if (arr[i]>slargest) {
                slargest=arr[i];
            }
        }
System.out.println(slargest);
    }
    
}
