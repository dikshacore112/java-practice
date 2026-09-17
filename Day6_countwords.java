public class Day6_countwords {
    public static int countwords(String str){
        String[] words=str.split(" ");
        return words.length;
    }
    public static void main(String[]args){
        System.out.println(countwords("java is a programming language"));

    }
}
