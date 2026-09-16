public class countdigit {
    public static void main(String[] args) {
        int n = 58392;
int target = 9;
int count=0;
for (int i = 0; i < n; i++) {
    if (i==target) {
        count=count+1; 
        System.out.println(count);
    }
    
}
    }
}