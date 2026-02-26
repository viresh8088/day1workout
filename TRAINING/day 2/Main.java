class Student{
    int id;
    String name;
    void display(){
        System.out.println(id+""+name);

    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.id = 100;
        s1.name="viresh";
        s1.display();
    }
}