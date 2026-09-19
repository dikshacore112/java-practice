public class studentcons {
    String name;
    int age;
    String course;
    studentcons (String name,int age,String course){
    this.name=name;
    this.age=age;
    this.course=course;
    }
    public static void main(String[] args) {
        studentcons s1=new studentcons("Diksha",20,"BCA");
        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        System.out.println("Course: "+s1.course);
    }

    
}
