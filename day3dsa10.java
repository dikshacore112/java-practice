public class day3dsa10 {
    public static void main(String[] args) {
        int[] arr = {18, 7, 25, 3, 12, 9};
        int smallest=arr[0];
        int ssmallest=arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                ssmallest=smallest;
            smallest=arr[i];
            
        }else
             if (arr[i]<ssmallest) {
    ssmallest=arr[i];
    
}
}
System.out.println(ssmallest);
    }

    }
    

