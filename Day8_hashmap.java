import java.util.HashMap;
public class Day8_hashmap {
    
    public static void main(String[] args) {
        HashMap<Integer, Integer> frequency=new HashMap<>();
        int[] arr = {4, 7, 4, 2, 7, 4};
        for(int i=0;i<arr.length;i++){
            
            int num=arr[i];
        frequency.put(num,frequency.getOrDefault(num,0)+1);
}
System.out.println(frequency);
        }
    }  
