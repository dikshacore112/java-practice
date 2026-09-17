public class Day6_reversestring {
    public static String reversestr(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }
        public static void main(String[]args){
        System.out.println(reversestr("developer"));
    }
    
}
