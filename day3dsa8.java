public class day3dsa8 {
public static void main(String[] args) {
    int[] arr = {12, 5, 8, 12, 3, 8, 9};
int target = 12;
int lastindex=-1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i]==target)
      lastindex=i;  
    continue;
}
System.out.println(lastindex);
}    
}
