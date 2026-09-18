public class Day7_ArrayMethod {
    public static int findLargest(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
return largest;
    }
    public static void main(String[]args){
        int[] arr = {12, 45, 7, 89, 34};
        System.out.println(findLargest(arr));
    }
    
}
