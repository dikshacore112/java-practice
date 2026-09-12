public class day2code8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10};
        int dup=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++){
 if (arr[i]==arr[j]) {
                dup=arr[j];
                break;
            }
        }
    
        
          if (dup!=-1) {
               break;    
          }
        }   
            System.out.println(dup);
        }
    }


