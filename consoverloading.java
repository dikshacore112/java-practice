public class consoverloading {
    String name;
    int age;
    String course;
    consoverloading (String name){
        this.name=name;
    }
    consoverloading (String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public static void main(String[] args) 
{
    consoverloading s1=new consoverloading("Diksha");
    consoverloading s2=new consoverloading("Aditi",21,"BCA");
    System.out.println("Name: "+s1.name);
    System.out.println("Name: "+s2.name);
    System.out.println("Age: "+s2.age);
    System.out.println("Course: "+s2.course);
}
}