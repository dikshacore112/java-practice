public class Day8_slidingwindow {
    public static void main(String[] args) {
        
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
int k = 3;
int sum=0;
for(int i=0;i<k;i++){
    sum=arr[i]+sum;
}
int maxsum=sum;
for(int i=k;i<arr.length;i++){
    sum=sum-arr[i-k]+arr[i];
    maxsum=Math.max(maxsum,sum);
}
System.out.println(maxsum);
    }
}