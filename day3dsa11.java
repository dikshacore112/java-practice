public class day3dsa11 {
    public static void main(String[] args) {
        int dup=-1;
        int[] arr = {10, 20, 10, 30, 20, 40};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]==arr[j]) {
                    dup=arr[j];
                    break;
                }
            }
            if (dup != -1) {
    break;
}
        }
System.out.println(dup);
    }
    
}
