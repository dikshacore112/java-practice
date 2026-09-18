public class Day7_counttargetint {
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 8, 2, 9, 2, 4};
        int target = 2;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count=count+1;
            }
        }
        System.out.println("Count of target number is: " + count);
    }
}
    