public class day2code7 {
    public static void main(String[] args) {
        int[] arr = {12, -5, 0, 8, -3, 0, 15, -2};
        int pos=0;
        int neg=0;
int zero=0;
for (int i = 0; i < arr.length; i++) {
    if(arr[i]>0){
        pos=pos+1;
} else
    if(arr[i]<0) {
    neg=neg+1;
} if (arr[i]==0) {
    zero=zero+1;
}
}
System.out.println("the even no. count is: "+pos);
System.out.println("the odd no. count is: "+neg);
System.out.println("the zero no. count is: "+zero);
}

} 

