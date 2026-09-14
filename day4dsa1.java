public class day4dsa1 {
    public static void main(String[] args) {
        int count=0;
        String str="programming";
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)=='a'||
            str.charAt(i)=='e'||
            str.charAt(i)=='i'||
            str.charAt(i)=='o'||
            str.charAt(i)=='u') {
                count=count+1;
                
            }
        }
        System.out.println(count);
    }
    
}
