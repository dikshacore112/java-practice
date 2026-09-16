public class day4dsa5 {
    public static void main(String[] args) {
        int n=58392;
        int sum=0;
        while (n>0){
            
sum=sum+n%10;
n=n/10;
        }
        System.out.println(sum);
    }
    
}
