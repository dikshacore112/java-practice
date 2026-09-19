public class encap {
    private String name;
    private int age;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public static void main(String[] args) {
        
        encap s1=new encap();
        s1.setname("diksha");
        s1.setage(20);
        System.out.println("Name: "+s1.getname());
        System.out.println("Age: "+s1.getage());

}
}