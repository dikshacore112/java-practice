public class day4java3 {
    public static int counteven(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2==0) {
            count=count+1;
        }
    }return count;
    }
        public static void main(String[] args){
            int[]arr ={12, 7, 8, 15, 20, 3};
            System.out.println(counteven(arr));
        }
    } 
    

